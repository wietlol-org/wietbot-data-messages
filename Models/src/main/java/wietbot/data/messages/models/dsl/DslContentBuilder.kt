package wietbot.data.messages.models.dsl

import wietbot.data.messages.models.models.*

class DslContentBuilder
{
	private val parts: MutableList<ContentPart> = mutableListOf()
	
	fun toSinglePart(): ContentPart =
		parts.singleOrNull() ?: DefaultMultiPart(parts)
	
	fun text(text: String): DslContentBuilder
	{
		parts.add(DefaultTextPart(text))
		return this
	}
	
	fun mono(text: String): DslContentBuilder
	{
		parts.add(DefaultInlineMonospacedPart(text))
		return this
	}
	
	fun monoBlock(text: String): DslContentBuilder
	{
		parts.add(DefaultMonospacedPart(text))
		return this
	}
	
	fun urlPart(href: String, text: DslContentBuilder.() -> Unit, title: (DslContentBuilder.() -> Unit)? = null): DslContentBuilder
	{
		val textPart = DslContentBuilder().apply(text).toSinglePart()
		
		if (textPart is MultiPart && textPart.parts.isEmpty())
			parts.add(DefaultTextPart(href))
		else
			parts.add(
				DefaultUrlPart(
					href,
					textPart,
					if (title != null)
						DslContentBuilder().apply(title).toSinglePart()
					else
						null
				)
			)
		return this
	}
	
	fun quotePart(content: DslContentBuilder.() -> Unit): DslContentBuilder
	{
		parts.add(
			DefaultQuotePart(
				DslContentBuilder().apply(content).toSinglePart()
			)
		)
		return this
	}
	
	fun boldPart(content: DslContentBuilder.() -> Unit): DslContentBuilder
	{
		parts.add(
			DefaultBoldPart(
				DslContentBuilder().apply(content).toSinglePart()
			)
		)
		return this
	}
	
	fun italicPart(content: DslContentBuilder.() -> Unit): DslContentBuilder
	{
		parts.add(
			DefaultItalicPart(
				DslContentBuilder().apply(content).toSinglePart()
			)
		)
		return this
	}
	
	fun strikeoutPart(content: DslContentBuilder.() -> Unit): DslContentBuilder
	{
		parts.add(
			DefaultStrikeoutPart(
				DslContentBuilder().apply(content).toSinglePart()
			)
		)
		return this
	}
	
	fun tagPart(name: String): DslContentBuilder
	{
		parts.add(DefaultTagPart(name))
		return this
	}
	
	companion object
	{
		fun content(handler: DslContentBuilder.() -> Unit): Content =
			DefaultContent(
				DslContentBuilder().apply(handler).toSinglePart()
			)
	}
}

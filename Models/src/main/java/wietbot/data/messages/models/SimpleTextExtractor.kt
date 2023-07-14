package wietbot.data.messages.models

import wietbot.data.messages.models.models.*

object SimpleTextExtractor
{
	fun getSimpleText(content: Content): String =
		getSimpleText(content.part)
	
	fun getSimpleText(part: ContentPart): String =
		when (part)
		{
			is MultiPart -> part.parts.joinToString("", transform = ::getSimpleText)
			is TextPart -> part.text
			is MonospacedPart -> part.text
			is InlineMonospacedPart -> part.text
			is UrlPart -> getSimpleText(part.text)
			is QuotePart -> getSimpleText(part.inner)
			is BoldPart -> getSimpleText(part.inner)
			is ItalicPart -> getSimpleText(part.inner)
			is StrikeoutPart -> getSimpleText(part.inner)
			else -> ""
		}
}

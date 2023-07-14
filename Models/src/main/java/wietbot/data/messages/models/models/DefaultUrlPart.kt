// hash: #13b57b1e
// @formatter:off

package wietbot.data.messages.models.models

import wietbot.data.messages.models.models.*

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:B8CiSn
// @tomplot:customCode:end
// @formatter:off

data class DefaultUrlPart(
	override val href: String,
	override val text: ContentPart,
	override val title: ContentPart?,
) : UrlPart
{
	override fun equals(other: Any?): Boolean =
		isEqualTo(other)
	
	override fun hashCode(): Int =
		computeHashCode()
	
	override fun toString(): String =
		toJson()
	
	override fun duplicate(): DefaultUrlPart =
		copy(
			href = href,
			text = text.duplicate(),
			title = title?.duplicate(),
		)
	
	// @formatter:on
	// @tomplot:customCode:start:fIpaBB
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on
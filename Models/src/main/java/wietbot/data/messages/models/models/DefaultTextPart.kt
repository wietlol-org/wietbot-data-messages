// hash: #c1b78949
// @formatter:off

package wietbot.data.messages.models.models

import wietbot.data.messages.models.models.*

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:B8CiSn
// @tomplot:customCode:end
// @formatter:off

data class DefaultTextPart(
	override val text: String,
) : TextPart
{
	override fun equals(other: Any?): Boolean =
		isEqualTo(other)
	
	override fun hashCode(): Int =
		computeHashCode()
	
	override fun toString(): String =
		toJson()
	
	override fun duplicate(): DefaultTextPart =
		copy(
			text = text,
		)
	
	// @formatter:on
	// @tomplot:customCode:start:fIpaBB
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

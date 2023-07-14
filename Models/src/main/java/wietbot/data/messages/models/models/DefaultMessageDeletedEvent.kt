// hash: #d25a7777
// @formatter:off

package wietbot.data.messages.models.models

import wietbot.data.messages.models.models.*

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:B8CiSn
// @tomplot:customCode:end
// @formatter:off

data class DefaultMessageDeletedEvent(
	override val id: String,
	override val timeStamp: Long,
	override val messageId: String,
	override val user: ChatUser,
	override val source: MessageSource,
	override val platform: Platform,
) : MessageDeletedEvent
{
	override fun equals(other: Any?): Boolean =
		isEqualTo(other)
	
	override fun hashCode(): Int =
		computeHashCode()
	
	override fun toString(): String =
		toJson()
	
	override fun duplicate(): DefaultMessageDeletedEvent =
		copy(
			id = id,
			timeStamp = timeStamp,
			messageId = messageId,
			user = user.duplicate(),
			source = source.duplicate(),
			platform = platform.duplicate(),
		)
	
	// @formatter:on
	// @tomplot:customCode:start:fIpaBB
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

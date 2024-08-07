// hash: #d51d58fe
// data: serializationKey:9dceabc8-b558-4b98-be20-2d34c431f97e
// @formatter:off

package wietbot.data.messages.models.models

import bitblock.api.serialization.BitSerializable
import java.util.UUID
import utils.common.Jsonable
import utils.common.emptyHashCode
import utils.common.toJsonString
import utils.common.with

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:gAeCSq
// @tomplot:customCode:end
// @formatter:off

interface MessageDeletedEvent : BitSerializable, ChatEvent, Jsonable
{
	companion object
	{
		val serializationKey: UUID
			get() = UUID.fromString("9dceabc8-b558-4b98-be20-2d34c431f97e")
	}
	
	override val serializationKey: UUID
		get() = Companion.serializationKey
	
	override val id: String
	
	override val timeStamp: Long
	
	override val messageId: String
	
	override val user: ChatUser
	
	override val source: MessageSource
	
	override val platform: Platform
	
	fun isEqualTo(other: Any?): Boolean
	{
		if (this === other) return true
		if (other == null) return false
		if (other !is MessageDeletedEvent) return false
		
		if (id != other.id) return false
		if (timeStamp != other.timeStamp) return false
		if (messageId != other.messageId) return false
		if (user != other.user) return false
		if (source != other.source) return false
		if (platform != other.platform) return false
		
		return true
	}
	
	fun computeHashCode(): Int =
		emptyHashCode
			.with(id)
			.with(timeStamp)
			.with(messageId)
			.with(user)
			.with(source)
			.with(platform)
	
	override fun toJson(): String =
		"""{"id":${id.toJsonString()},"timeStamp":${timeStamp.toJsonString()},"messageId":${messageId.toJsonString()},"user":${user.toJsonString()},"source":${source.toJsonString()},"platform":${platform.toJsonString()}}"""
	
	override fun duplicate(): MessageDeletedEvent
	
	// @formatter:on
	// @tomplot:customCode:start:32T3K8
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

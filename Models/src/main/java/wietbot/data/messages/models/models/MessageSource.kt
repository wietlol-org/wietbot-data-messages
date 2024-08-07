// hash: #ffde9cf4
// data: serializationKey:3f2bc886-0f53-4ebc-ad46-7793a734e251
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

interface MessageSource : BitSerializable, Jsonable
{
	companion object
	{
		val serializationKey: UUID
			get() = UUID.fromString("3f2bc886-0f53-4ebc-ad46-7793a734e251")
	}
	
	override val serializationKey: UUID
		get() = Companion.serializationKey
	
	val id: String
	
	val name: String
	
	val platform: Platform
	
	fun isEqualTo(other: Any?): Boolean
	{
		if (this === other) return true
		if (other == null) return false
		if (other !is MessageSource) return false
		
		if (id != other.id) return false
		if (name != other.name) return false
		if (platform != other.platform) return false
		
		return true
	}
	
	fun computeHashCode(): Int =
		emptyHashCode
			.with(id)
			.with(name)
			.with(platform)
	
	override fun toJson(): String =
		"""{"id":${id.toJsonString()},"name":${name.toJsonString()},"platform":${platform.toJsonString()}}"""
	
	override fun duplicate(): MessageSource
	
	// @formatter:on
	// @tomplot:customCode:start:32T3K8
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

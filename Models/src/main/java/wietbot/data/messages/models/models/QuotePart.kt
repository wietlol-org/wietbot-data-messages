// hash: #cfa15bd3
// data: serializationKey:4823a56c-3439-48c5-8b6a-db21e0001137
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

interface QuotePart : BitSerializable, ContentPart, Jsonable
{
	companion object
	{
		val serializationKey: UUID
			get() = UUID.fromString("4823a56c-3439-48c5-8b6a-db21e0001137")
	}
	
	override val serializationKey: UUID
		get() = Companion.serializationKey
	
	val inner: ContentPart
	
	fun isEqualTo(other: Any?): Boolean
	{
		if (this === other) return true
		if (other == null) return false
		if (other !is QuotePart) return false
		
		if (inner != other.inner) return false
		
		return true
	}
	
	fun computeHashCode(): Int =
		emptyHashCode
			.with(inner)
	
	override fun toJson(): String =
		"""{"inner":${inner.toJsonString()}}"""
	
	override fun duplicate(): QuotePart
	
	// @formatter:on
	// @tomplot:customCode:start:32T3K8
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

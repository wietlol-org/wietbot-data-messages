// hash: #e5008cad
// data: serializationKey:f1f86a75-8c2a-4a88-ad08-046e6e9dc650
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

interface BoldPart : BitSerializable, ContentPart, Jsonable
{
	companion object
	{
		val serializationKey: UUID
			get() = UUID.fromString("f1f86a75-8c2a-4a88-ad08-046e6e9dc650")
	}
	
	override val serializationKey: UUID
		get() = Companion.serializationKey
	
	val inner: ContentPart
	
	fun isEqualTo(other: Any?): Boolean
	{
		if (this === other) return true
		if (other == null) return false
		if (other !is BoldPart) return false
		
		if (inner != other.inner) return false
		
		return true
	}
	
	fun computeHashCode(): Int =
		emptyHashCode
			.with(inner)
	
	override fun toJson(): String =
		"""{"inner":${inner.toJsonString()}}"""
	
	override fun duplicate(): BoldPart
	
	// @formatter:on
	// @tomplot:customCode:start:32T3K8
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on
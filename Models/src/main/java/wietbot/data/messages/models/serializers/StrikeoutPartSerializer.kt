// hash: #5c93d4ca
// @formatter:off

package wietbot.data.messages.models.serializers

import bitblock.api.serialization.DeserializationContext
import bitblock.api.serialization.ModelSerializer
import bitblock.api.serialization.Schema
import bitblock.api.serialization.SerializationContext
import bitblock.api.serialization.deserialize
import java.io.InputStream
import java.io.OutputStream
import java.util.UUID
import utils.common.streams.readUnsignedVarInt
import utils.common.streams.writeUnsignedVarInt
import wietbot.data.messages.models.builders.StrikeoutPartBuilder
import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.StrikeoutPart

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:70v0f9
// @tomplot:customCode:end
// @formatter:off

object StrikeoutPartSerializer : ModelSerializer<StrikeoutPart, StrikeoutPart>
{
	private val endOfObject: Int = 0
	
	private val innerIndex: Int = 1
	
	override val modelId: UUID
		get() = StrikeoutPart.serializationKey
	
	override val dataClass: Class<StrikeoutPart>
		get() = StrikeoutPart::class.java
	
	override fun serialize(serializationContext: SerializationContext, stream: OutputStream, schema: Schema, entity: StrikeoutPart)
	{
		stream.writeUnsignedVarInt(innerIndex)
		schema.serialize(serializationContext, stream, entity.inner)
		
		stream.writeUnsignedVarInt(endOfObject)
	}
	
	override fun deserialize(deserializationContext: DeserializationContext, stream: InputStream, schema: Schema): StrikeoutPart
	{
		var inner: ContentPart? = null
		
		while (true)
		{
			when (stream.readUnsignedVarInt())
			{
				endOfObject -> return DefaultStrikeoutPart(
					inner!!,
				)
				innerIndex -> inner = schema.deserialize(deserializationContext, stream)
				else -> schema.deserialize<Any>(deserializationContext, stream)
			}
		}
	}
	
	// @formatter:on
	// @tomplot:customCode:start:5CFs54
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on

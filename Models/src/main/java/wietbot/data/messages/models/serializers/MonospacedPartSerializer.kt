// hash: #a628b267
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
import wietbot.data.messages.models.builders.MonospacedPartBuilder
import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.MonospacedPart

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:70v0f9
// @tomplot:customCode:end
// @formatter:off

object MonospacedPartSerializer : ModelSerializer<MonospacedPart, MonospacedPart>
{
	private val endOfObject: Int = 0
	
	private val textIndex: Int = 1
	
	override val modelId: UUID
		get() = MonospacedPart.serializationKey
	
	override val dataClass: Class<MonospacedPart>
		get() = MonospacedPart::class.java
	
	override fun serialize(serializationContext: SerializationContext, stream: OutputStream, schema: Schema, entity: MonospacedPart)
	{
		stream.writeUnsignedVarInt(textIndex)
		schema.serialize(serializationContext, stream, entity.text)
		
		stream.writeUnsignedVarInt(endOfObject)
	}
	
	override fun deserialize(deserializationContext: DeserializationContext, stream: InputStream, schema: Schema): MonospacedPart
	{
		var text: String? = null
		
		while (true)
		{
			when (stream.readUnsignedVarInt())
			{
				endOfObject -> return DefaultMonospacedPart(
					text!!,
				)
				textIndex -> text = schema.deserialize(deserializationContext, stream)
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
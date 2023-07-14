// hash: #ddd6fff9
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
import wietbot.data.messages.models.builders.ContentBuilder
import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.Content

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:70v0f9
// @tomplot:customCode:end
// @formatter:off

object ContentSerializer : ModelSerializer<Content, Content>
{
	private val endOfObject: Int = 0
	
	private val partIndex: Int = 1
	
	override val modelId: UUID
		get() = Content.serializationKey
	
	override val dataClass: Class<Content>
		get() = Content::class.java
	
	override fun serialize(serializationContext: SerializationContext, stream: OutputStream, schema: Schema, entity: Content)
	{
		stream.writeUnsignedVarInt(partIndex)
		schema.serialize(serializationContext, stream, entity.part)
		
		stream.writeUnsignedVarInt(endOfObject)
	}
	
	override fun deserialize(deserializationContext: DeserializationContext, stream: InputStream, schema: Schema): Content
	{
		var part: ContentPart? = null
		
		while (true)
		{
			when (stream.readUnsignedVarInt())
			{
				endOfObject -> return DefaultContent(
					part!!,
				)
				partIndex -> part = schema.deserialize(deserializationContext, stream)
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
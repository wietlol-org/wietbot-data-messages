// hash: #0f7e933d
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
import wietbot.data.messages.models.builders.MessageDeletedEventBuilder
import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.MessageDeletedEvent

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:70v0f9
// @tomplot:customCode:end
// @formatter:off

object MessageDeletedEventSerializer : ModelSerializer<MessageDeletedEvent, MessageDeletedEvent>
{
	private val endOfObject: Int = 0
	
	private val idIndex: Int = 1
	
	private val timeStampIndex: Int = 2
	
	private val messageIdIndex: Int = 3
	
	private val userIndex: Int = 4
	
	private val sourceIndex: Int = 5
	
	private val platformIndex: Int = 6
	
	override val modelId: UUID
		get() = MessageDeletedEvent.serializationKey
	
	override val dataClass: Class<MessageDeletedEvent>
		get() = MessageDeletedEvent::class.java
	
	override fun serialize(serializationContext: SerializationContext, stream: OutputStream, schema: Schema, entity: MessageDeletedEvent)
	{
		stream.writeUnsignedVarInt(idIndex)
		schema.serialize(serializationContext, stream, entity.id)
		
		stream.writeUnsignedVarInt(timeStampIndex)
		schema.serialize(serializationContext, stream, entity.timeStamp)
		
		stream.writeUnsignedVarInt(messageIdIndex)
		schema.serialize(serializationContext, stream, entity.messageId)
		
		stream.writeUnsignedVarInt(userIndex)
		schema.serialize(serializationContext, stream, entity.user)
		
		stream.writeUnsignedVarInt(sourceIndex)
		schema.serialize(serializationContext, stream, entity.source)
		
		stream.writeUnsignedVarInt(platformIndex)
		schema.serialize(serializationContext, stream, entity.platform)
		
		stream.writeUnsignedVarInt(endOfObject)
	}
	
	override fun deserialize(deserializationContext: DeserializationContext, stream: InputStream, schema: Schema): MessageDeletedEvent
	{
		var id: String? = null
		var timeStamp: Long? = null
		var messageId: String? = null
		var user: ChatUser? = null
		var source: MessageSource? = null
		var platform: Platform? = null
		
		while (true)
		{
			when (stream.readUnsignedVarInt())
			{
				endOfObject -> return DefaultMessageDeletedEvent(
					id!!,
					timeStamp!!,
					messageId!!,
					user!!,
					source!!,
					platform!!,
				)
				idIndex -> id = schema.deserialize(deserializationContext, stream)
				timeStampIndex -> timeStamp = schema.deserialize(deserializationContext, stream)
				messageIdIndex -> messageId = schema.deserialize(deserializationContext, stream)
				userIndex -> user = schema.deserialize(deserializationContext, stream)
				sourceIndex -> source = schema.deserialize(deserializationContext, stream)
				platformIndex -> platform = schema.deserialize(deserializationContext, stream)
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

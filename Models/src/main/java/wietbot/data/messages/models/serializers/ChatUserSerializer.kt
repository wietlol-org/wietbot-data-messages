// hash: #741db88b
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
import wietbot.data.messages.models.builders.ChatUserBuilder
import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.ChatUser

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:70v0f9
// @tomplot:customCode:end
// @formatter:off

object ChatUserSerializer : ModelSerializer<ChatUser, ChatUser>
{
	private val endOfObject: Int = 0
	
	private val localIdIndex: Int = 1
	
	private val localNameIndex: Int = 2
	
	private val platformIndex: Int = 3
	
	private val internalIdIndex: Int = 4
	
	private val stackOverflowIdIndex: Int = 5
	
	private val stackOverflowNameIndex: Int = 6
	
	private val discordIdIndex: Int = 7
	
	private val discordNameIndex: Int = 8
	
	private val wietbotWebsiteIdIndex: Int = 9
	
	private val wietbotWebsiteNameIndex: Int = 10
	
	override val modelId: UUID
		get() = ChatUser.serializationKey
	
	override val dataClass: Class<ChatUser>
		get() = ChatUser::class.java
	
	override fun serialize(serializationContext: SerializationContext, stream: OutputStream, schema: Schema, entity: ChatUser)
	{
		stream.writeUnsignedVarInt(localIdIndex)
		schema.serialize(serializationContext, stream, entity.localId)
		
		stream.writeUnsignedVarInt(localNameIndex)
		schema.serialize(serializationContext, stream, entity.localName)
		
		stream.writeUnsignedVarInt(platformIndex)
		schema.serialize(serializationContext, stream, entity.platform)
		
		stream.writeUnsignedVarInt(internalIdIndex)
		schema.serialize(serializationContext, stream, entity.internalId)
		
		entity.stackOverflowId?.also {
			stream.writeUnsignedVarInt(stackOverflowIdIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		entity.stackOverflowName?.also {
			stream.writeUnsignedVarInt(stackOverflowNameIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		entity.discordId?.also {
			stream.writeUnsignedVarInt(discordIdIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		entity.discordName?.also {
			stream.writeUnsignedVarInt(discordNameIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		entity.wietbotWebsiteId?.also {
			stream.writeUnsignedVarInt(wietbotWebsiteIdIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		entity.wietbotWebsiteName?.also {
			stream.writeUnsignedVarInt(wietbotWebsiteNameIndex)
			schema.serialize(serializationContext, stream, it)
		}
		
		stream.writeUnsignedVarInt(endOfObject)
	}
	
	override fun deserialize(deserializationContext: DeserializationContext, stream: InputStream, schema: Schema): ChatUser
	{
		var localId: String? = null
		var localName: String? = null
		var platform: Platform? = null
		var internalId: Long? = null
		var stackOverflowId: String? = null
		var stackOverflowName: String? = null
		var discordId: String? = null
		var discordName: String? = null
		var wietbotWebsiteId: String? = null
		var wietbotWebsiteName: String? = null
		
		while (true)
		{
			when (stream.readUnsignedVarInt())
			{
				endOfObject -> return DefaultChatUser(
					localId!!,
					localName!!,
					platform!!,
					internalId!!,
					stackOverflowId,
					stackOverflowName,
					discordId,
					discordName,
					wietbotWebsiteId,
					wietbotWebsiteName,
				)
				localIdIndex -> localId = schema.deserialize(deserializationContext, stream)
				localNameIndex -> localName = schema.deserialize(deserializationContext, stream)
				platformIndex -> platform = schema.deserialize(deserializationContext, stream)
				internalIdIndex -> internalId = schema.deserialize(deserializationContext, stream)
				stackOverflowIdIndex -> stackOverflowId = schema.deserialize(deserializationContext, stream)
				stackOverflowNameIndex -> stackOverflowName = schema.deserialize(deserializationContext, stream)
				discordIdIndex -> discordId = schema.deserialize(deserializationContext, stream)
				discordNameIndex -> discordName = schema.deserialize(deserializationContext, stream)
				wietbotWebsiteIdIndex -> wietbotWebsiteId = schema.deserialize(deserializationContext, stream)
				wietbotWebsiteNameIndex -> wietbotWebsiteName = schema.deserialize(deserializationContext, stream)
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

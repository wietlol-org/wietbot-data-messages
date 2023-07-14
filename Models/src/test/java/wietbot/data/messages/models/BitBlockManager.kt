package wietbot.data.messages.models

import bitblock.codegenerator.BitModuleProcessor
import bitblock.codegenerator.generators.kotlin.BitModuleKotlinGenerator
import bitblock.core.BitSchemaBuilder
import java.io.File

object BitBlockManager
{
	@JvmStatic
	fun main(args: Array<String>)
	{
		BitModuleProcessor.processBitModule(
			File("Models/src/main/resources/wietbot/data/messages/models/WietbotMessages.bitmodule"),
			BitModuleKotlinGenerator(),
		)
		
		BitSchemaBuilder.buildSchema(
			File("Models/src/main/resources/wietbot/data/messages/models/WietbotMessages.bitschema"),
			WietbotDataMessages.modelSerializers,
		)
	}

//	@Test
//	fun foo2()
//	{
//		val schema = BitSchemaBuilder.buildSchema(
//			WietbotDataMessages.javaClass.getResourceAsStream("/me/wietlol/wietbot/data/messages/models/WietbotMessages.bitschema"),
//			listOf(BitBlockBase, WietbotDataMessages)
//		)
//
//		val file = File("D:/Users/Harry/RiderProjects/WietbotDataMessages/WietbotDataMessagesTests/Test1.bit")
//
//		println(schema.deserialize(file.inputStream())) // broken in C#
//		println(schema.deserialize<BitDynamicObject>(file.inputStream())) // broken in Kotlin and C#
//		println(schema.deserialize<MessageEventList>(file.inputStream())) // broken in C#
//	}

//	@Test
//	fun foo()
//	{
//		val schema = BitSchemaBuilder.buildSchema(
//			WietbotDataMessages.javaClass.getResourceAsStream("/me/wietlol/wietbot/data/messages/models/WietbotMessages.bitschema"),
//			listOf(BitBlockBase, WietbotDataMessages)
//		)
//
//		val messageId = "messageId"
//		val userId = "userId"
//		val userName = "userName"
//
//		val platform = DefaultPlatform.stackOverflow
//		val user = DefaultChatUser(
//			userId,
//			userName,
//			platform,
//			42,
//			userId,
//			userName,
//			null,
//			null,
//			null,
//			null,
//		)
//		val messageSource = DefaultMessageSource(
//			"7",
//			"C#",
//			platform,
//		)
//
//		val events = DefaultMessageEventList(
//			messageId,
//			listOf(
//				DefaultMessagePostedEvent(
//					"eventId1",
//					11111,
//					messageId,
//					ContentBuilder.content {
//						text("Hello World!")
//					},
//					user,
//					messageSource,
//					platform,
//				),
//				DefaultMessageEditedEvent(
//					"eventId2",
//					22222,
//					messageId,
//					ContentBuilder.content {
//						text("Hello, World!")
//					},
//					user,
//					messageSource,
//					platform,
//				),
//				DefaultMessageEditedEvent(
//					"eventId3",
//					33333,
//					messageId,
//					ContentBuilder.content {
//						text("(removed)")
//					},
//					user,
//					messageSource,
//					platform,
//				),
//				DefaultMessageDeletedEvent(
//					"eventId4",
//					44444,
//					messageId,
//					user,
//					messageSource,
//					platform,
//				),
//			),
//		)
//
//		val file = File("D:/Users/Harry/RiderProjects/WietbotDataMessages/WietbotDataMessagesTests/Test1.bit")
//		file.createNewFile()
//		schema.serialize(file.outputStream(), events)
//	}
}

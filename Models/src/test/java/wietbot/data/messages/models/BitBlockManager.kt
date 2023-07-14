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
}

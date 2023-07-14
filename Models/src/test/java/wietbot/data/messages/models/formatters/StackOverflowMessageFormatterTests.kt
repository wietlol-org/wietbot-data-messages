package wietbot.data.messages.models.formatters

import org.junit.Test
import unittest.core.models.TestCase
import wietbot.data.messages.models.LocalTestModule
import wietbot.data.messages.models.dsl.DslContentBuilder
import wietbot.data.messages.models.models.Content

class StackOverflowMessageFormatterTests : LocalTestModule()
{
	@Test
	fun `assert that formatting works`() = unitTest	{
		execute(sequenceOf(
			DslContentBuilder.content {
				text("Hello, World!")
			} to listOf("Hello, World!"),
			
			DslContentBuilder.content {
				boldPart {
					text("bold")
				}
			} to listOf("**bold**"),
			
			DslContentBuilder.content {
				strikeoutPart {
					boldPart {
						text("bold and strikeout")
					}
				}
			} to listOf("---**bold and strikeout**---"),
			
			DslContentBuilder.content {
				strikeoutPart {
					boldPart {
						italicPart {
							text("bold, strikeout and italic")
						}
						quotePart {
							text("quote")
						}
						text("still bold and strikeout")
					}
				}
			} to listOf(
				"---***bold, strikeout and italic***---",
				"> ---**quote**---",
				"---**still bold and strikeout**---",
			),
		))
	}
	
	@Test
	fun `assert that escaping works properly`() = unitTest {
		execute(sequenceOf(
			DslContentBuilder.content {
				text("¯\\_(ツ)_/¯")
			} to listOf("¯\\\\_(ツ)_/¯"),
			
			DslContentBuilder.content {
				monoBlock("¯\\_(ツ)_/¯")
			} to listOf("    ¯\\_(ツ)_/¯"),
			
			DslContentBuilder.content {
				text("**")
			} to listOf("\\*\\*"),
			
			DslContentBuilder.content {
				mono("**")
			} to listOf("`**`"),
		))
	}
	// \\title\\*\\* = \\title\*\*
	
	private fun TestCase.execute(tests: Sequence<Pair<Content, List<String>>>)
	{
		val service = StackOverflowMessageFormatter
		
		tests.forEach { (input, expected) ->
			val actual = service.format(input)
			
			assertThat(actual).isEqualTo(expected)
		}
	}
}

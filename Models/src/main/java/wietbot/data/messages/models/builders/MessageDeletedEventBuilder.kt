// hash: #48f7e39d
// @formatter:off

package wietbot.data.messages.models.builders

import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.DefaultMessageDeletedEvent

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:f5k3GB
// @tomplot:customCode:end
// @formatter:off

class MessageDeletedEventBuilder
{
	var id: String? = null
	
	var timeStamp: Long? = null
	
	var messageId: String? = null
	
	var user: ChatUser? = null
	
	var source: MessageSource? = null
	
	var platform: Platform? = null
	
	fun build(): MessageDeletedEvent =
		DefaultMessageDeletedEvent(
			id!!,
			timeStamp!!,
			messageId!!,
			user!!,
			source!!,
			platform!!,
		)
	
	// @formatter:on
	// @tomplot:customCode:start:0ETUWm
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on
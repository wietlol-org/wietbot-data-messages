// hash: #8c7310f4
// @formatter:off

package wietbot.data.messages.models.builders

import wietbot.data.messages.models.models.*
import wietbot.data.messages.models.models.DefaultMonospacedPart

// Generated by BitBlock version 1.0.0

// @formatter:on
// @tomplot:customCode:start:f5k3GB
// @tomplot:customCode:end
// @formatter:off

class MonospacedPartBuilder
{
	var text: String? = null
	
	fun build(): MonospacedPart =
		DefaultMonospacedPart(
			text!!,
		)
	
	// @formatter:on
	// @tomplot:customCode:start:0ETUWm
	// @tomplot:customCode:end
	// @formatter:off
}
// @formatter:on
package tech.sprytin.starter.chatgpt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("chatgpt")
data class ChatGPTProperties(
    val url: String,
    val token: String
)
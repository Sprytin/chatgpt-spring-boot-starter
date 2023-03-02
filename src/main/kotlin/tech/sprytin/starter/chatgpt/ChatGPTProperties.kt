package tech.sprytin.starter.chatgpt

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("chatgpt")
data class ChatGPTProperties(
    val url: String,
    val token: String
)
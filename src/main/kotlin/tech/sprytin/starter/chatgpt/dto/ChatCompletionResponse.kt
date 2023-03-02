package tech.sprytin.starter.chatgpt.dto

data class ChatCompletionResponse(
    val id: String,
    val created: Long,
    val choices: List<ChatChoice>,
    val usage: ChatUsage
)
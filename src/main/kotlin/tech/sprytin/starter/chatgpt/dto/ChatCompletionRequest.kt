package tech.sprytin.starter.chatgpt.dto

data class ChatCompletionRequest(
    val model: String,
    val messages: List<ChatMessage>
) {
    companion object {
        const val GPT3_5_TURBO = "gpt-3.5-turbo"
        const val GPT3_5_TURBO_0301 = "gpt-3.5-turbo-0301"
    }
}
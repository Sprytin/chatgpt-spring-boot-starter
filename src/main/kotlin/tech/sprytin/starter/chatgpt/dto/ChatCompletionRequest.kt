package tech.sprytin.starter.chatgpt.dto

data class ChatCompletionRequest(
    val messages: List<ChatMessage>,
    val model: String = GPT3_5_TURBO,
    val temperature: Int = 1,
) {
    companion object {
        const val GPT3_5_TURBO = "gpt-3.5-turbo"
        const val GPT3_5_TURBO_0301 = "gpt-3.5-turbo-0301"
    }
}
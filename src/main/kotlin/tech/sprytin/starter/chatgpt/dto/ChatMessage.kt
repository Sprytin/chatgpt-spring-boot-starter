package tech.sprytin.starter.chatgpt.dto

import com.fasterxml.jackson.annotation.JsonValue

data class ChatMessage(
    val role: ChatMessageRole,
    val content: String
)

enum class ChatMessageRole(private val value: String) {
    USER("user"), SYSTEM("system"), ASSISTANT("assistant");

    @JsonValue
    fun getValue() = value
}
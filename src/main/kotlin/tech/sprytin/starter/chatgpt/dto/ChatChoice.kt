package tech.sprytin.starter.chatgpt.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatChoice(
    val index: Int,
    val message: ChatMessage,
    @JsonProperty("finish_reason")
    val finishReason: String
)
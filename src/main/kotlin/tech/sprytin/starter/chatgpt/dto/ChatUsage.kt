package tech.sprytin.starter.chatgpt.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatUsage(
    @JsonProperty("prompt_tokens")
    val promptTokens: Int,
    @JsonProperty("completion_tokens")
    val completionTokens: Int,
    @JsonProperty("total_tokens")
    val totalTokens: Int
)
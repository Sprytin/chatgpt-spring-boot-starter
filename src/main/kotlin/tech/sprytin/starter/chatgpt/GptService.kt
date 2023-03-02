package tech.sprytin.starter.chatgpt

import org.springframework.web.reactive.function.client.WebClient
import tech.sprytin.starter.chatgpt.dto.ChatCompletionRequest
import tech.sprytin.starter.chatgpt.dto.ChatCompletionResponse

class GptService(
    private val gptWebClient: WebClient
) {
    fun askGpt(request: ChatCompletionRequest) = gptWebClient.post()
        .bodyValue(request)
        .retrieve()
        .bodyToMono(ChatCompletionResponse::class.java)
}
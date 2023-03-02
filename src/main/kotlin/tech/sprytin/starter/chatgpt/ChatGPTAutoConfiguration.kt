package tech.sprytin.starter.chatgpt

import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@AutoConfigureAfter(JacksonAutoConfiguration::class)
@EnableConfigurationProperties(ChatGPTProperties::class)
class ChatGPTAutoConfiguration {

    @Bean
    fun gptWebClient(chatGPTProperties: ChatGPTProperties) =
        WebClient.builder()
            .baseUrl(chatGPTProperties.url)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer ${chatGPTProperties.token}")
            .build()

    @Bean
    fun gptService(gptWebClient: WebClient) = GptService(gptWebClient)
}
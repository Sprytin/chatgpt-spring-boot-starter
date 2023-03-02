# Kotlin ChatGPT
[![](https://jitpack.io/v/tech.sprytin/chatgpt-spring-boot-starter.svg)](https://jitpack.io/#tech.sprytin/chatgpt-spring-boot-starter)
# How to use
+ Add the JitPack repository to your root build.gradle file:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

+ Add the code to your **module**'s build.gradle file:

```gradle
dependencies {
    implementation 'tech.sprytin:chatgpt-spring-boot-starter:x.y.z'
}

//build.gradle.kts
dependencies {
    implementation("tech.sprytin:chatgpt-spring-boot-starter:x.y.z")
}
```

## Put token from [OpenAI](https://platform.openai.com/account/api-keys) in application.yml 
```yaml
chatgpt:
  token: "TOKEN"
```
## Example
+ add GptService bean  
```kotlin
@Service
class ExampleService(
    val gptService: GptService
) 
```

+ Request example
```kotlin
fun example() {
    val response = gptService.askGpt(
        ChatCompletionRequest(
            listOf(ChatMessage(content = "Hello!"))
        )
    ).block()

    println(response)
}
```
Messages must be an array of message objects, where each object has a role (either “system”, “user”, or “assistant”) and content (the content of the message). Conversations can be as short as 1 message or fill many pages.
If a conversation cannot fit within the model’s token limit, it will need to be shortened in some way.

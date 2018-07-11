package th.co.street.webboard.controllers

import th.co.street.webboard.services.TopicService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import th.co.street.webboard.models.Topic
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class TopicController(private val topicService: TopicService) {

    @GetMapping("/topics")
    fun getAll(): List<Topic> = topicService.findAll()


//    @PostMapping("/topics")
//    fun createNewArticle(@Valid @RequestBody topic: Topic): Topic =
//            topicService.save(topic)
//
//
//    @GetMapping("/topics/{id}")
//    fun getArticleById(@PathVariable(value = "id") id: Long): ResponseEntity<Topic> {
//        return topicService.findById(id).map { topic ->
//            ResponseEntity.ok(topic)
//        }.orElse(ResponseEntity.notFound().build())
//    }
//
//    @PutMapping("/topics/{id}")
//    fun updateArticleById(@PathVariable(value = "id") id: Long,
//                          @Valid @RequestBody newTopic: Topic: Topic): ResponseEntity<Topic> {
//
//        return topicService.findById(id).map { existingArticle ->
//            val updatedArticle: Topic = existingArticle
//                    .copy(title = newArticle.title, content = newArticle.content)
//            ResponseEntity.ok().body(articleRepository.save(updatedArticle))
//        }.orElse(ResponseEntity.notFound().build())
//
//    }
//
//    @DeleteMapping("/topics/{id}")
//    fun deleteArticleById(@PathVariable(value = "id") id: Long): ResponseEntity<Void> {
//
//        return topicService.findById(id).map { topic  ->
//            topicService.delete(topic)
//            ResponseEntity<Void>(HttpStatus.OK)
//        }.orElse(ResponseEntity.notFound().build())
//
//    }
}
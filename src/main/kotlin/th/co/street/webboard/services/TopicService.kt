package th.co.street.webboard.services

import org.springframework.stereotype.Service
import th.co.street.webboard.repositories.TopicRepository

@Service
class TopicService(private val topicRepository: TopicRepository) {
    fun findAll() = topicRepository.findAll()
}
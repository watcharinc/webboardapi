package th.co.street.webboard.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import th.co.street.webboard.models.Topic

@Repository
interface TopicRepository : JpaRepository<Topic, Long>
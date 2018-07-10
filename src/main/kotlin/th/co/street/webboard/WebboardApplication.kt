package th.co.street.webboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebboardApplication

fun main(args: Array<String>) {
    runApplication<WebboardApplication>(*args)
}

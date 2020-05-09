package src

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@SpringBootApplication
@EnableDiscoveryClient
class ApiServer

object ApiServer extends App {
  SpringApplication.run(classOf[ApiServer], args: _*)
}

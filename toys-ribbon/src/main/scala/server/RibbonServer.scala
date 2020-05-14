package server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableDiscoveryClient
class RibbonServer

object RibbonServer {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[RibbonServer], args: _*)
  }

  @Bean
  @LoadBalanced
  def restTemplate: RestTemplate = new RestTemplate()


}

package com.jaehong.grafanademo.controller

import com.jaehong.grafanademo.service.HelloService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/demo/v1")
class HelloController(private val service: HelloService) {

  private val logger = LoggerFactory.getLogger(HelloController::class.java)

  @GetMapping("/hello")
  fun helloWorld(): String {
    val str = service.sayHello()
    logger.info(">> Service said $str")
    return str
  }
}
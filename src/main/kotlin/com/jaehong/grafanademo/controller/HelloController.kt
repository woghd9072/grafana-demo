package com.jaehong.grafanademo.controller

import com.jaehong.grafanademo.service.HelloService
import com.fasterxml.jackson.databind.ObjectMapper
import com.jaehong.grafanademo.response.HelloResponse
import com.jaehong.grafanademo.service.HelloService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/demo/v1")
class HelloController(private val service: HelloService) {

  private val logger = LoggerFactory.getLogger(HelloController::class.java)
  private val mapper = ObjectMapper()

  @GetMapping("/hello")
  fun helloWorld(): String {
    val str = service.sayHello()
    logger.info(">> Service said $str")
    return str
  }
  @GetMapping("helloLoki")
  fun helloWorldLoki(): ResponseEntity<HelloResponse> {
    val random = generateRandom()
    val response = HelloResponse(id = random, message = "HelloWorld")
    val value = mapper.writeValueAsString(response)
    logger.info(value)

    service.convert(response)
    return ResponseEntity.ok().body(response)
  }

  fun generateRandom(): String{
    val random = (1..1000).random()
    return "003I0000$random"
  }
}
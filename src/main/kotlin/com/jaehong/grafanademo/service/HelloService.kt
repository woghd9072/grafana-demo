package com.jaehong.grafanademo.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class HelloService {

  private val logger = LoggerFactory.getLogger(HelloService::class.java)
  fun sayHello(): String {
    logger.info(">> Service Say Hello")
    return "hello world"
  }
}
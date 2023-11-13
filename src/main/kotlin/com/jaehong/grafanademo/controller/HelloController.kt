package com.jaehong.grafanademo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/demo/v1")
class HelloController {

  @GetMapping("/hello")
  fun helloWorld(): String = "hello world"
}
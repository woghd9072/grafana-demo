package com.jaehong.grafanademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrafanaDemoApplication

fun main(args: Array<String>) {
	runApplication<GrafanaDemoApplication>(*args)
}

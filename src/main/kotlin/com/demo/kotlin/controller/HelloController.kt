package com.demo.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloController {

    @GetMapping("{name}")
    fun hello(@PathVariable("name") name: String): String {
        return "Hello: $name"
    }
}
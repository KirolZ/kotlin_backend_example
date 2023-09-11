package com.kotlin_backend_example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @GetMapping
    fun helloWorld(): String = "Hello, this is a REST endpoint!"

}
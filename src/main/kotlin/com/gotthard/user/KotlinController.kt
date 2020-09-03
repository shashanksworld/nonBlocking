package com.gotthard.user

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
public class KotlinController {

    @RequestMapping("/")
    fun index(): String {
        return "Server is Working!!! Using a Tomcat Controller"
    }
}
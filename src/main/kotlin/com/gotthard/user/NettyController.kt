package com.gotthard.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nettyWorks")
public class NettyController {


    @GetMapping("/get")
    fun nettyAction():String = "Netty Controller works with Server request"
}
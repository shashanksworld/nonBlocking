package com.gotthard.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class UserManagementApplication

fun main(args: Array<String>) {
	runApplication<UserManagementApplication>(*args)
}

@Bean
fun commandLineRunner(ctx: ApplicationContext ) {
	System.out.print("Lets inspect the bean provided by spring")
	val beanName = ctx.getBeanDefinitionNames()
	Arrays.sort(beanName)
}
package com.dev.archictecture.service

import com.dev.archictecture.entity.Form
import com.dev.archictecture.entity.FormRepository
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class FormService(val dataBase: FormRepository) {
    private val log = KotlinLogging.logger {}
    fun getUser(name: String) =
        Form(1, "Jocimar", "Neres", "jocimar@zup.com")

    fun addUser(user: Form) =
        log.info("${user.name},added!!!")

    fun updateUser(name: String, user: Form) =
        log.info("$name,updated!!!")

    fun deleteUser(name: String) =
        log.info("$name,deleted!!!")

}
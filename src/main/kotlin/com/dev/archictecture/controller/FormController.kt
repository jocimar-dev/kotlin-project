package com.dev.archictecture.controller

import com.dev.archictecture.entity.Form
import com.dev.archictecture.service.FormService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class FormController() {

    @Autowired
    lateinit var service: FormService


    @GetMapping("/forms")
    fun getUser(@RequestParam(value = "name") name: String) =
        service.getUser(name)


    @PostMapping("/forms")
    fun addUser(@RequestBody form: Form) =
        service.addUser(form)


    @PutMapping("/forms")
    fun updateUser(@RequestParam(value = "name") name: String, @RequestBody form: Form) =
        service.updateUser(name, form)


    @DeleteMapping("/forms")
    fun deleteUser(@RequestParam(value = "name") name: String) =
        service.deleteUser(name)
}

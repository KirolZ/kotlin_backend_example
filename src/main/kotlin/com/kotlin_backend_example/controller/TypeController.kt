package com.kotlin_backend_example.controller

import com.kotlin_backend_example.model.Types
import com.kotlin_backend_example.repository.TypeRepository
import com.kotlin_backend_example.service.TypeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/type")
class TypeController (
    private  val typeRepository: TypeRepository,
    private val typeService: TypeService
){

    @GetMapping("")
    fun getTypes(): List<Types> = typeService.getAllType()


}
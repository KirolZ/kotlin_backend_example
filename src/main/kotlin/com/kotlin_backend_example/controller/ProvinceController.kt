package com.kotlin_backend_example.controller

import com.kotlin_backend_example.model.Province
import com.kotlin_backend_example.repository.ProvinceRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/province")
class ProvinceController (
    private val provinceRepository: ProvinceRepository
){

    fun getProvince(): List<Province> = provinceRepository.findAll()

}
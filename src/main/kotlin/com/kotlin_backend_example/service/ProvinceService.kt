package com.kotlin_backend_example.service

import com.kotlin_backend_example.model.Province
import com.kotlin_backend_example.repository.ProvinceRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
class ProvinceService (
    private val provinceRepository: ProvinceRepository
){
    fun getAllProvince(): List<Province> = provinceRepository.findAll()
}
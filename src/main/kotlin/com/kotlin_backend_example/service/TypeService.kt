package com.kotlin_backend_example.service

import com.kotlin_backend_example.model.Types
import com.kotlin_backend_example.repository.TypeRepository
import org.springframework.stereotype.Service

@Service
class TypeService (
    private val typeRepository: TypeRepository
)   {
    fun getAllType(): List<Types> = typeRepository.findAll()
}
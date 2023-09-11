package com.kotlin_backend_example.repository

import com.kotlin_backend_example.model.Manufactured
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ManufacturedRepository: JpaRepository<Manufactured, Long> {

    fun findByName(name: String?): Manufactured?

    fun findByNameLikeOrderByIdAsc(name: String?): List<Manufactured?>?
}
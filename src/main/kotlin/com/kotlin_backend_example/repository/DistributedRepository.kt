package com.kotlin_backend_example.repository

import com.kotlin_backend_example.model.Distributed
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DistributedRepository: JpaRepository<Distributed, Long> {

    fun findByName(name: String?): Distributed?

    fun findByNameLikeOrderByIdAsc(name: String?): List<Distributed?>?
}
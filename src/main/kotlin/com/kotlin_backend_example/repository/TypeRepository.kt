package com.kotlin_backend_example.repository

import com.kotlin_backend_example.model.Types
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository: JpaRepository<Types, Long> {
}
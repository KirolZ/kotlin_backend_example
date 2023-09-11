package com.kotlin_backend_example.repository

import com.kotlin_backend_example.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {

    fun findByManufacturedId(id: Long?): List<Product?>?

    fun findByDistributedId(id: Long?): List<Product?>?

    fun findByName(name: String?): Product?

    fun findByNameLikeOrderByIdAsc(name: String?): List<Product?>?

    @Query(
        value = "SELECT id, detail, name, retail, wholesale, distributed_id, manufactured_id, type_id, created_at, updated_at FROM drug WHERE id NOT IN (SELECT drug_id FROM stock)",
        nativeQuery = true
    )
    fun findNotInStock(): List<Product?>?
}
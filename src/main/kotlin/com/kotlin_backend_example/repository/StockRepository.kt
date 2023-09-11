package com.kotlin_backend_example.repository

import com.kotlin_backend_example.model.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository: JpaRepository<Stock, Long> {

}
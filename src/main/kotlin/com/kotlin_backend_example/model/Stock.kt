package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "stock")
data class Stock (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    val createdAt: LocalDateTime? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    var updatedAt: LocalDateTime? = null,

    @Column(name = "quantity")
    var quantity: Int? = null,

    @ManyToOne
    @JoinColumn(name = "product_id")
    var product: Product? = null,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnore
    @JoinColumn(name = "stock_id")
    var stockRecords: Set<StockRecord>? = null
)
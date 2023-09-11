package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDateTime


@Entity
@Table(name = "stock_record")
data class StockRecord (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    var createdAt: LocalDateTime? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    var updatedAt: LocalDateTime? = null,

    @Column(name = "transfer")
    var transfer: Int? = null,

    @ManyToOne @OnDelete(action = OnDeleteAction.CASCADE) @JoinColumn(name = "stock_id")
    var stock: Stock? = null

)
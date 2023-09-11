package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity
@Table(name = "types")
data class Types (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(name = "name", unique = true)
    var name: String? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JsonIgnore
    @JoinColumn(name = "types_id")
    var product: Set<Product>? = null
)

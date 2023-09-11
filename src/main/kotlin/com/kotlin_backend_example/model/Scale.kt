package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
@Table(name = "scale")
data class Scale (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(name = "name", unique = true)
    var name: String? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JsonIgnore
    @JoinColumn(name = "scale_id")
    var product: Set<Product>? = null

)
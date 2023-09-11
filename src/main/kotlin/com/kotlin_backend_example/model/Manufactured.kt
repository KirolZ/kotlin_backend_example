package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*



@Entity
@Table(name = "manufactured")
data class Manufactured (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(name = "name", unique = true)
    var name: String? = null,

    @ManyToOne
    @JoinColumn(name = "province_id")
    val province: Province? = null,

    @ManyToOne
    @JoinColumn(name = "country_id")
    var country: Country? = null,


    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonIgnore
    @JoinColumn(name = "manufactured_id")
    var product: Set<Product>? = null,
)
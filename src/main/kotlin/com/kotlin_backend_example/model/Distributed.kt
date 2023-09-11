package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity
@Table(name = "distributed")
data class Distributed (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(nullable = false)
    var name: String? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JsonIgnore
    @JoinColumn(name = "distributed_id")
    var product: Set<Product>? = null,

    @ManyToOne
    @JoinColumn(name = "province_id")
    var province: Province? = null,

    @ManyToOne
    @JoinColumn(name = "country_id")
    var country: Country? = null

)
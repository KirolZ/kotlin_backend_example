package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*



@Entity
@Table(name = "country")
data class Country (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(name = "name_th", unique = true)
    var nameTh: String? = null,

    @Column(name = "name_en", unique = true)
    var nameEn: String? = null,

    @Column(name = "code", unique = true)
    var code: String? = null,

    @Column(name = "ct_code", unique = true)
    var ctCode: String? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JsonIgnore
    @JoinColumn(name = "country_id")
    var distributed: Set<Distributed>? = null
)
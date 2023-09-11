package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity
@Table(name = "province")
data class Province (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36, nullable = false, updatable = false)
    val id: Long? = null,

    @Column(name = "name_th", unique = true)
    var nameTh: String? = null,

    @Column(name = "name_en", unique = true)
    var nameEn: String? = null,

    @Column(name = "abbr", unique = true)
    var abbr: String? = null,

    @Column(name = "abbr3", unique = true)
    var abbr3: String? = null,

    @Column(name = "region", unique = true)
    var region: String? = null,

    @OneToMany(cascade = [(CascadeType.ALL)])
    @JsonIgnore
    @JoinColumn(name = "province_id")
    var distributed: Set<Distributed>? = null

)
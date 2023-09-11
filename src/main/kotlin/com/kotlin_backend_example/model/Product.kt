package com.kotlin_backend_example.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime
import jakarta.persistence.*


@Entity
@Table(name = "product")
data class Product (

    @Id
    var id: Long? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    val createdAt: LocalDateTime? = null,

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    var updatedAt: LocalDateTime? = null,

    @Column(name = "name", unique = true)
    var name: String? = null,

    @Column(name = "detail")
    var detail: String? = null,

    @Column(name = "wholesale")
    var wholesale: Int? = null,

    @Column(name = "retail")
    var retail: Int? = null,


    @ManyToOne
    @JoinColumn(name = "manufactured_id")
    val manufactured: Manufactured? = null,

    @ManyToOne
    @JoinColumn(name = "distributed_id")
    val distributed: Distributed? = null,

    @ManyToOne
    @JoinColumn(name = "types_id")
    val type: Types? = null,

    @ManyToOne
    @JoinColumn(name = "scale_id")
    val scale: Scale? = null,

    @OneToMany(cascade = [CascadeType.ALL])
    @JsonIgnore
    @JoinColumn(name = "product_id")
    val stock: Set<Stock>? = null,
)
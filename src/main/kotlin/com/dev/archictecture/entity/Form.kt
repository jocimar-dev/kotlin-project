package com.dev.archictecture.entity

import org.springframework.data.repository.CrudRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Form (
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String? = null,
    var surname: String? = null,
    var email: String? = null,
)

interface FormRepository: CrudRepository<Form, Long>{

}
package edu.unito.common.data

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.validation.constraints.NotBlank

@Entity
data class GameEntity(
    @Id @GeneratedValue val id: Long,
    @NotBlank val availableModes: String,
    @NotBlank val image: String
)

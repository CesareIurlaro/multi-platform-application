package edu.unito.common.data

import java.util.*
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.validation.constraints.NotBlank

@Entity
data class MatchEntity(
    @Id @GeneratedValue val id: Long,
    @NotBlank val matchDateTime: Date,
    @NotBlank val tournamentInvolved: Long
)
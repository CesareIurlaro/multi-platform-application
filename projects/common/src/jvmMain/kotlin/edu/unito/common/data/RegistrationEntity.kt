package edu.unito.common.data

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(RegistrationId::class)
data class RegistrationEntity(
    @Id val userId: Long,
    @Id val matchId: Long,
    val outcome: String
)

data class RegistrationId(
    private val userId: Long,
    private val matchId: Long
) : Serializable
package edu.unito.backend.data

import edu.unito.common.data.GameEntity
import edu.unito.common.data.MatchEntity
import edu.unito.common.data.RegistrationEntity
import edu.unito.common.data.TournamentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TournamentRepository : JpaRepository<TournamentEntity, Long>

@RepositoryRestResource
interface MatchRepository : JpaRepository<MatchEntity, Long>

@RepositoryRestResource
interface RegistrationRepository : JpaRepository<RegistrationEntity, Long>

@RepositoryRestResource
interface GameRepository : JpaRepository<GameEntity, Long>


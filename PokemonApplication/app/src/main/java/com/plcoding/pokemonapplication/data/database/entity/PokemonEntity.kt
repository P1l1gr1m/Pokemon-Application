package com.plcoding.pokemonapplication.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemons")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val pokeName: String
)

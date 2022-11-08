package com.plcoding.pokemonapplication.domain.model

import javax.annotation.concurrent.Immutable

@Immutable
data class PokemonListEntry(
    val pokemonName: String,
    val imageUrl: String,
    val number: Int
)

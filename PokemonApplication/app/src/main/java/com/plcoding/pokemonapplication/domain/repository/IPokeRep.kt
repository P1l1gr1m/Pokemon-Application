package com.plcoding.pokemonapplication.domain.repository

import com.plcoding.pokemonapplication.data.remote.responses.Pokemon
import com.plcoding.pokemonapplication.data.remote.responses.PokemonList
import com.plcoding.pokemonapplication.domain.util.Resource

interface IPokeRep {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
}
package com.plcoding.pokemonapplication.pokemondetail

import androidx.lifecycle.ViewModel
import com.plcoding.pokemonapplication.data.remote.responses.Pokemon
import com.plcoding.pokemonapplication.repository.PokemonRepository
import com.plcoding.pokemonapplication.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}
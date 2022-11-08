package com.plcoding.pokemonapplication.domain.views

import androidx.lifecycle.ViewModel
import com.plcoding.pokemonapplication.data.remote.responses.Pokemon
import com.plcoding.pokemonapplication.domain.repository.PokemonRepository
import com.plcoding.pokemonapplication.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Math.round
import javax.annotation.concurrent.Immutable
import javax.inject.Inject

@HiltViewModel
@Immutable
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}

fun weightCalc(pokemonWeight: Int): Float = (round(pokemonWeight * 100f) / 1000f)

fun heightCalc(pokemonHeight: Int): Float = (round(pokemonHeight * 100f) / 10f)
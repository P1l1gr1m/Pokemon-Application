package com.plcoding.pokemonapplication.data.database

import android.content.Context
import com.plcoding.pokemonapplication.data.database.dto.Pokemon
import com.plcoding.pokemonapplication.data.database.mapper.PokemonMapper

class DataBaseRepository private constructor(private val dataBase: DataBase) {
    companion object {
        private var INSTANCE: DataBaseRepository? = null

        fun get(context: Context): DataBaseRepository{
            if (INSTANCE == null){
                INSTANCE = DataBaseRepository(DataBase.get(context))
            }
            return INSTANCE as DataBaseRepository
        }
    }

    fun savePokemon(pokemon: Pokemon) = dataBase.pokemonDAO().save(PokemonMapper.toEntity(pokemon))
    fun getByID(id: Int) = dataBase.pokemonDAO().getByID(id)?.let { PokemonMapper.toDTO(it) }
}
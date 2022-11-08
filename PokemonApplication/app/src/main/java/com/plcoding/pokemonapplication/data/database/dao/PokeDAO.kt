package com.plcoding.pokemonapplication.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.plcoding.pokemonapplication.data.database.entity.PokemonEntity

@Dao
interface PokeDAO {
    @Insert(onConflict = REPLACE)
    fun save(pokemonEntity: PokemonEntity)

    @Query("SELECT * FROM pokemons WHERE `id` =:id")
    fun getByID(id: Int): PokemonEntity?
}
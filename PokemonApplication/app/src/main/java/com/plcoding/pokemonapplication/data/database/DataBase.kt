package com.plcoding.pokemonapplication.data.database

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.plcoding.pokemonapplication.data.database.dao.PokeDAO
import com.plcoding.pokemonapplication.data.database.entity.PokemonEntity

@Database(entities = [PokemonEntity::class], version = 1)
abstract class DataBase: RoomDatabase() {
    companion object {
        private var INSTANCE: DataBase? = null

        fun get(context: Context): DataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, DataBase::class.java, "database").build()
            }
            return INSTANCE as DataBase
        }
    }

    abstract fun pokemonDAO(): PokeDAO
}
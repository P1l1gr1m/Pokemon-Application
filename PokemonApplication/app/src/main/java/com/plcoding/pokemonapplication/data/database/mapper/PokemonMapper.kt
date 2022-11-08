package com.plcoding.pokemonapplication.data.database.mapper

import com.plcoding.pokemonapplication.data.database.dto.Pokemon
import com.plcoding.pokemonapplication.data.database.entity.PokemonEntity

object PokemonMapper: IMapper<PokemonEntity, Pokemon> {
    override fun toDTO(from: PokemonEntity): Pokemon {
        return Pokemon(
            id = from.id,
            pokeName = from.pokeName
        )
    }

    override fun toEntity(from: Pokemon): PokemonEntity {
        return PokemonEntity(
            id = from.id,
            pokeName = from.pokeName
        )
    }
}
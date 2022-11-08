package com.plcoding.pokemonapplication.data.database.mapper

interface IMapper<T,R> {
    fun toDTO(from: T): R
    fun toEntity(from: R): T
}
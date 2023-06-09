package com.example.rickandmortytest.data.model

import java.io.Serializable

data class CharacterEntity(
    val id: Int? = null,
    val image: String? = null,
    val status: String? = null,
    val name: String? = null,
    val episode: List<String>? = null,
    val species: String? = null,
    val location: LocationCharacterEntity,
    val origin: OriginEntity,
    val gender: String? = null
) : Serializable

data class OriginEntity(
    val name: String? = null,
    val url: String? = null
)

data class LocationCharacterEntity(
    val name: String? = null,
    val url: String? = null
)
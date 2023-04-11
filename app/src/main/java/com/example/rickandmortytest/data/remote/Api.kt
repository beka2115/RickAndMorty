package com.example.rickandmortytest.data.remote

import com.example.rickandmortytest.data.model.CharactersEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("character")
   suspend fun getCharacters(
        @Query("page") page: Int
    ): Response<CharactersEntity>

}
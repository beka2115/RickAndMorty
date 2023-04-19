package com.example.rickandmortytest.domain.repository

import androidx.paging.PagingData
import com.example.rickandmortytest.data.model.LocationEntity
import com.example.rickandmortytest.domain.model.Character
import com.example.rickandmortytest.domain.model.Episode
import com.example.rickandmortytest.domain.model.Location
import com.example.rickandmortytest.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getCharacters(names:String? = null): Flow<PagingData<Character>>
    fun getLocations(names:String? = null): Flow<PagingData<Location>>
    fun getEpisodes(names:String? = null): Flow<PagingData<Episode>>

    fun getCharacter(id:Int): Flow<Resource<Character>>
    fun getLocation(id:Int): Flow<Resource<Location>>
    fun getEpisode(id:List<Int>): Flow<Resource<List<Episode>>>

}
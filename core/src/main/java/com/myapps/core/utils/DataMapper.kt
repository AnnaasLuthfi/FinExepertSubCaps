package com.myapps.core.utils

import com.myapps.core.data.source.local.entity.SportEntity
import com.myapps.core.data.source.remote.response.SportResponse
import com.myapps.core.domain.model.Sport

object DataMapper {

    fun mapResponsesToEntities(input: List<SportResponse>): List<SportEntity> {
        val sportList = ArrayList<SportEntity>()
        input.map {
            val sport = SportEntity(
                idSport = it.idSport,
                strSport = it.strSport,
                strFormat = it.strFormat,
                strSportThumb = it.strSportThumb,
                strSportThumbGreen = it.strSportThumbGreen,
                strSportDescription = it.strSportDescription,
                isFavorite = false
            )
            sportList.add(sport)
        }
        return sportList
    }

    fun mapEntitiesToDomain(input: List<SportEntity>): List<Sport> =
        input.map {
            Sport(
                idSport = it.idSport,
                strSport = it.strSport,
                strFormat = it.strFormat,
                strSportThumb = it.strSportThumb,
                strSportThumbGreen = it.strSportThumbGreen,
                strSportDescription = it.strSportDescription,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Sport) = SportEntity(
        idSport = input.idSport,
        strSport = input.strSport!!,
        strFormat = input.strFormat!!,
        strSportThumb = input.strSportThumb!!,
        strSportThumbGreen = input.strSportThumbGreen!!,
        strSportDescription = input.strSportDescription!!,
        isFavorite = input.isFavorite
    )
}
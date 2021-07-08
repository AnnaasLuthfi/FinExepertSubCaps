package com.myapps.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sport(
    val idSport: String,
    val strSport: String? = null,
    val strFormat: String? = null,
    val strSportThumb: String? = null,
    val strSportThumbGreen: String? = null,
    val strSportDescription: String? = null,
    val isFavorite: Boolean
) : Parcelable
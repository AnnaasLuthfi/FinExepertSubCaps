package com.myapps.core.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "sport")
data class SportEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "idSport")
    var idSport: String,

    @ColumnInfo(name = "strSport")
    var strSport: String? = null,

    @ColumnInfo(name = "strFormat")
    var strFormat: String? = null,

    @ColumnInfo(name = "strSportThumb")
    var strSportThumb: String? = null,

    @ColumnInfo(name = "strSportThumbGreen")
    var strSportThumbGreen: String? = null,

    @ColumnInfo(name = "strSportDescription")
    var strSportDescription: String? = null,

    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = false

) : Parcelable
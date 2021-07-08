package com.myapps.core.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.myapps.core.data.source.local.entity.SportEntity

@Database(entities = [SportEntity::class], version = 1, exportSchema = false)
abstract class SportDatabase : RoomDatabase() {

    abstract fun sportDao() : SportDao

    companion object {
        @Volatile
        private var INSTANCE : SportDatabase? = null

    }
}
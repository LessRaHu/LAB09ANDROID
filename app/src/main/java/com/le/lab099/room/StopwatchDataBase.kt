package com.le.lab099.roompackage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.le.lab099.model.Stopwatch
import com.le.lab099.room.StopwatchDataDao

@Database(entities = [Stopwatch::class], version = 1, exportSchema = false)
abstract class StopwatchDatabase : RoomDatabase() {
    abstract fun stopwatchDataDao(): StopwatchDataDao // Corrected function name and added return type
}

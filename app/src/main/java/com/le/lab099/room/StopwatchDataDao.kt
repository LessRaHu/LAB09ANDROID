package com.le.lab099.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.le.lab099.model.Stopwatch
import kotlinx.coroutines.flow.Flow

@Dao
interface StopwatchDataDao {
    @Query("SELECT * FROM stopwatch")
    fun getStopwatches(): kotlinx.coroutines.flow.Flow<List<Stopwatch>>

    @Query("SELECT * FROM stopwatch WHERE id = :id")
    fun getStopwatchById(id: Long): kotlinx.coroutines.flow.Flow<Stopwatch>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(stopwatch: Stopwatch)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(stopwatch: Stopwatch)

    @Delete
    suspend fun delete(stopwatch: Stopwatch)
}

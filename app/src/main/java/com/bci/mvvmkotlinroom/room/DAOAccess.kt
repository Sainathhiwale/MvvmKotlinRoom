package com.bci.mvvmkotlinroom.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bci.mvvmkotlinroom.model.LoginTableModel

@Dao
interface DAOAccess {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertData(loginTableModel: LoginTableModel)

    @Query("SELECT * FROM Login WHERE Username =:username")
    fun getLoginDetails(username: String?) : LiveData<LoginTableModel>

}
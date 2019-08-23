package com.newlondonweb.tabbedfragmentdemo.sections.notes.notes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("SELECT * FROM note_table ORDER BY priority")
    fun getAllNotes(): LiveData<List<Note>>
}
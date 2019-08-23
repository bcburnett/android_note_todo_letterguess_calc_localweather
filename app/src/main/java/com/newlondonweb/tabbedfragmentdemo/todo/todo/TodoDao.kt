package com.newlondonweb.tabbedfragmentdemo.todo.todo

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Insert
    suspend fun insert(todo:Todo)

    @Update
    suspend fun update(todo: Todo)

    @Delete
    suspend fun delete(todo: Todo)

    @Query("SELECT * FROM todo_table ORDER BY done,priority")
    fun getAllTodos(): LiveData<List<Todo>>
}
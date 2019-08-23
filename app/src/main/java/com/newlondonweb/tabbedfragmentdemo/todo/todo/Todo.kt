package com.newlondonweb.tabbedfragmentdemo.todo.todo


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class Todo (
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    @ColumnInfo(name="title") val title:String,
    @ColumnInfo(name="description") val description:String="Add Description",
    @ColumnInfo(name="priority") val priority:Int =1,
    @ColumnInfo(name="done") val done:Boolean=false
)
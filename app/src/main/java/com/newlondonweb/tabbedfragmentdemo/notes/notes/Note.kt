package com.newlondonweb.tabbedfragmentdemo.notes.notes


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note (
    @PrimaryKey(autoGenerate = true) val id:Int = 0,
    @ColumnInfo(name="title") val title:String,
    @ColumnInfo(name="description") val description:String,
    @ColumnInfo(name="image") val image:String,
    @ColumnInfo(name="priority") val priority:Int
)
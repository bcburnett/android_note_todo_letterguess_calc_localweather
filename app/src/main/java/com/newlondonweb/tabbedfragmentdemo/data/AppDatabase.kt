package com.newlondonweb.tabbedfragmentdemo.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note
import com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.NoteDao
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.TodoDao

@Database(entities = [Note::class, Todo::class], version = 3,exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
    abstract fun todoDao(): TodoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            if (INSTANCE != null)  return INSTANCE as AppDataBase
            synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "Note_database")
                    .fallbackToDestructiveMigration()
                    .build()
                return INSTANCE as AppDataBase
            }
        }
    }
}
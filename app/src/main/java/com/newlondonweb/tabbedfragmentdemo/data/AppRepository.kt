package com.newlondonweb.tabbedfragmentdemo.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note
import com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.NoteDao
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.TodoDao

class AppRepository(private val noteDao: NoteDao, private val todoDao: TodoDao) {

    companion object {
        @Volatile
        private var INSTANCE: AppRepository? = null

        fun newInstance(application: Application): AppRepository {
            if (INSTANCE != null) return INSTANCE as AppRepository
            synchronized(this) {
                val noteDao = AppDataBase.getInstance(application).noteDao()
                val todoDao = AppDataBase.getInstance(application).todoDao()
                INSTANCE = AppRepository(noteDao, todoDao)
                return INSTANCE as AppRepository
            }
        }
    }

     val allNotes: LiveData<List<Note>>
         get() = noteDao.getAllNotes()

     suspend fun insert(note: Note){
        noteDao.insert(note)
    }

     suspend fun delete(note: Note){
        noteDao.delete(note)
    }


     suspend fun update(note: Note){
        noteDao.update(note)
    }


     val allTodos: LiveData<List<Todo>>
         get() = todoDao.getAllTodos()

     suspend fun insert(todo: Todo){
        todoDao.insert(todo)
    }

     suspend fun delete(todo: Todo){
        todoDao.delete(todo)
    }


     suspend fun update(todo: Todo){
        todoDao.update(todo)
    }

}
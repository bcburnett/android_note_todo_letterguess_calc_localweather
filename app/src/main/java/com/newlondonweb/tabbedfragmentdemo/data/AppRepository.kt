package com.newlondonweb.tabbedfragmentdemo.data

import androidx.lifecycle.LiveData
import com.newlondonweb.tabbedfragmentdemo.data.notes.Note
import com.newlondonweb.tabbedfragmentdemo.data.notes.NoteDao
import com.newlondonweb.tabbedfragmentdemo.data.todo.Todo
import com.newlondonweb.tabbedfragmentdemo.data.todo.TodoDao

class AppRepository(private val noteDao: NoteDao, private val todoDao: TodoDao) {

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
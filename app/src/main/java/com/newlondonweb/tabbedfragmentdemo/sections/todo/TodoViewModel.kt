package com.newlondonweb.tabbedfragmentdemo.sections.todo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.newlondonweb.tabbedfragmentdemo.data.AppRepository
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo

class TodoViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        @Volatile
        private var INSTANCE: TodoViewModel? = null
        fun newInstance(application: Application): TodoViewModel {
            if (INSTANCE != null) return INSTANCE as TodoViewModel
            synchronized(this) {
                INSTANCE = TodoViewModel(application)
                return INSTANCE as TodoViewModel
            }
        }
    }

    private val repository = AppRepository.newInstance(application)

    val allTodos: LiveData<List<Todo>>
        get() = repository.allTodos

    suspend fun insert(todo: Todo) = repository.insert(todo)
    suspend fun update(todo: Todo) = repository.update(todo)
    suspend fun delete(todo: Todo) = repository.delete(todo)
}
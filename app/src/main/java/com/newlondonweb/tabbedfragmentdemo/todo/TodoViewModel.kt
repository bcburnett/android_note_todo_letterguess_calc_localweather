package com.newlondonweb.tabbedfragmentdemo.todo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.data.AppRepository
import com.newlondonweb.tabbedfragmentdemo.todo.todo.Todo

class TodoViewModel(application: Application) : AndroidViewModel(application) {



    private val repository = AppRepository(
        AppDataBase.getInstance(application).noteDao(),
        AppDataBase.getInstance(application).todoDao()
    )


    ///////////////////////////ToDo List /////////////////////////////////////////

    val allTodos: LiveData<List<Todo>>
        get() = repository.allTodos

    suspend fun insert(todo: Todo) = repository.insert(todo)
    suspend fun update(todo: Todo) = repository.update(todo)
    suspend fun delete(todo: Todo) = repository.delete(todo)

}
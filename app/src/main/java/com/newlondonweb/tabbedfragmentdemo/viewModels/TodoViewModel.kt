package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.app.Application
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.data.AppRepository
import com.newlondonweb.tabbedfragmentdemo.data.todo.Todo
import java.text.SimpleDateFormat
import java.util.*

class TodoViewModel(application: Application) : AndroidViewModel(application) {

    val frag1Data: LiveData<String>
        get() = frag1TimeDisplay
    private val frag1TimeDisplay =
        MutableLiveData(
            "Current Time : ${SimpleDateFormat(
                "HH:mm:ss",
                Locale.US
            ).format(Calendar.getInstance().time)}"
        )

    var runTimer = true

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


    init {
        doTimer()
    }

    fun doTimer() {
        //Clock display
        runTimer = true
        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post(object : Runnable {
            override fun run() {
                frag1TimeDisplay.value =
                    "Current Time : ${SimpleDateFormat(
                        "HH:mm:ss",
                        Locale.US
                    ).format(Calendar.getInstance().time)}"
                if (runTimer) mainHandler.postDelayed(this, 1000)
            }
        })
    }


    fun stopTimer() {
        runTimer = false
    }

}
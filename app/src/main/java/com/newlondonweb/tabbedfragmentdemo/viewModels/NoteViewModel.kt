package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.app.Application
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.data.AppRepository
import com.newlondonweb.tabbedfragmentdemo.data.notes.Note
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


class NoteViewModel(application: Application) : AndroidViewModel(application) {

    /////////////////////////////NOTES/////////////////////////////////

    val frag1Data: LiveData<String>
        get() = frag1TimeDisplay
    private val frag1TimeDisplay =
        MutableLiveData(
            "Current Time : ${SimpleDateFormat(
                "HH:mm:ss",
                Locale.US
            ).format(Calendar.getInstance().time)}"
        )

    var runTimer=true
    private val repository = AppRepository(
        AppDataBase.getInstance(application).noteDao(),
        AppDataBase.getInstance(application).todoDao()
    )

    val allNotes: LiveData<List<Note>>
        get() = repository.allNotes

    suspend fun insert(note: Note) = repository.insert(note)
    suspend fun update(note: Note) = repository.update(note)
    suspend fun delete(note: Note) {
        (File(note.image).exists())&&(File(note.image).delete())
        repository.delete(note)
    }

    internal val currentNote: LiveData<Note>
        get() = myNote
    private  var  myNote = MutableLiveData<Note>()
    fun setCurrentNote(currentNote: Note) {
        myNote.value=currentNote
    }


    init {
    doTimer()
    }

    fun doTimer(){
               //Clock display
        runTimer=true
        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post(object : Runnable {
            override fun run() {
                frag1TimeDisplay.value =
                    "Current Time : ${SimpleDateFormat(
                        "HH:mm:ss",
                        Locale.US
                    ).format(Calendar.getInstance().time)}"
               if(runTimer) mainHandler.postDelayed(this, 1000)
            }
        })
    }


    fun stopTimer(){runTimer=false}







}
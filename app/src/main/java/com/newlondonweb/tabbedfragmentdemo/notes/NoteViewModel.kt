package com.newlondonweb.tabbedfragmentdemo.notes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.data.AppRepository
import com.newlondonweb.tabbedfragmentdemo.notes.notes.Note
import java.io.File


class NoteViewModel(application: Application) : AndroidViewModel(application) {

    /////////////////////////////NOTES/////////////////////////////////


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


}
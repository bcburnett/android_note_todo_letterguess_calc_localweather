package com.newlondonweb.tabbedfragmentdemo.sections.notes

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.sections.notes.BitmapOperations.GetBitmap
import com.newlondonweb.tabbedfragmentdemo.sections.notes.BitmapOperations.SaveBitmap
import com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note
import kotlinx.android.synthetic.main.frag1_fragment.*
import kotlinx.android.synthetic.main.layout_add.view.*
import kotlinx.android.synthetic.main.layout_popup.view.*
import kotlinx.android.synthetic.main.picture_view.view.*
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlinx.android.synthetic.main.layout_popup.view.et_details as et_details1
import kotlinx.android.synthetic.main.layout_popup.view.et_priority as et_priority1
import kotlinx.android.synthetic.main.layout_popup.view.et_title as et_title1


class NoteFragment : Fragment() {

    companion object {
        fun newInstance(): NoteFragment =NoteFragment()
    }


    val vm: NoteViewModel by lazy {
        this.activity.let {
            ViewModelProvider(it!!).get(
                NoteViewModel::class.java
            )
        }
    }

    private val va: NoteAdapter =
        NoteAdapter(frag = this)
    private var mfile: File? = null
    private val REQUEST_TAKE_PHOTO = 10
    private var currentPhotoPath: String = ""

    private val window = PopupWindow(
        this.view,
        Resources.getSystem().displayMetrics.widthPixels,
        Resources.getSystem().displayMetrics.heightPixels,
        true
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(
            R.layout.frag1_fragment,
            container,
            false
        )


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val recyclerView = rv_Notes

        recyclerView.layoutManager = GridLayoutManager(this.context, 1)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = va

        vm.allNotes.observe(this, Observer {
            va.setNotes(it)
        })

        iv_Add.setOnClickListener { newNote() }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_TAKE_PHOTO && resultCode == Activity.RESULT_OK) {
            (File(vm.currentNote.value!!.image).exists()) && (File(vm.currentNote.value!!.image).delete())
            SaveBitmap(mfile!!.absolutePath)
                .execute()
            vm.viewModelScope.launch {
                vm.update(
                    Note(
                        priority = vm.currentNote.value!!.priority,
                        description = vm.currentNote.value!!.description,
                        title = vm.currentNote.value!!.title,
                        image = mfile!!.absolutePath,
                        id = vm.currentNote.value!!.id
                    )
                )
            }


        }
    }


    fun editNote(currentNote: Note) {
        window.dismiss()
        val view = layoutInflater.inflate(R.layout.layout_popup, this.constraintlayout, false)
        view.et_title1.setText(currentNote.title)
        view.et_details1.setText(currentNote.description)
        view.et_priority1.setText(currentNote.priority.toString())
        view.btn_Edit.setOnClickListener {
            vm.viewModelScope.launch {
                vm.update(
                    Note(
                        priority = view.et_priority.text.toString().toInt(),
                        description = view.et_details.text.toString(),
                        title = view.et_title.text.toString(),
                        id = currentNote.id,
                        image = currentNote.image
                    )
                )
            }
            window.dismiss()
        }
        view.btn_edit_Cancel.setOnClickListener { window.dismiss() }
        window.contentView = view
        window.showAsDropDown(guideline)
    }


    private fun newNote() {
        window.dismiss()
        val view = layoutInflater.inflate(R.layout.layout_add, this.constraintlayout, false)
        view.btn_Add.setOnClickListener {
            vm.viewModelScope.launch {
                vm.insert(
                    Note(
                        priority = view.et_priority.text.toString().toInt(),
                        description = view.et_details.text.toString(),
                        title = view.et_title.text.toString(),
                        image = ""
                    )
                )
            }
            window.dismiss()
        }
        view.btn_Cancel.setOnClickListener { window.dismiss() }
        window.contentView = view
        window.showAsDropDown(guideline)
    }

    fun delNote(currentNote: Note) {
        activity?.let {
            AlertDialog.Builder(it)
                .setTitle("Delete Note")
                .setMessage("Do you really want to delete this note?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(R.string.delete) { _: DialogInterface, _: Int ->
                    vm.viewModelScope.launch { vm.delete(currentNote) }
                }
                .setNegativeButton(android.R.string.no, null).show()
        }
    }

    fun getPicture(currentNote: Note) {
        vm.setCurrentNote(currentNote)
        startCamera()
    }

    private fun startCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(this.activity!!.packageManager)!!.also {
                mfile = File.createTempFile(
                    "JPEG_${SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())}_",
                    ".webp",
                    this.context!!.getExternalFilesDir(Environment.DIRECTORY_DCIM)
                ).apply { currentPhotoPath = absolutePath }

                val photoURI: Uri = FileProvider.getUriForFile(
                    this.context!!,
                    "com.newlondonweb.tabbedfragmentdemo.fileprovider",
                    mfile!!
                )
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO)
            }
        }
    }

    fun showImage(currentNote: Note) {
        if (currentNote.image == "") return
        window.dismiss()
        val view = layoutInflater.inflate(R.layout.picture_view, this.constraintlayout, false)
        GetBitmap(
            view.iv_PictureView,
            currentNote.image
        ).execute()
        view.iv_PictureView.setOnClickListener { window.dismiss() }
        window.contentView = view
        window.showAsDropDown(guideline)
    }

}

package com.newlondonweb.tabbedfragmentdemo.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.notes.notes.Note
import com.newlondonweb.tabbedfragmentdemo.notes.BitmapOperations.GetBitmap
import kotlinx.android.synthetic.main.note_item.view.*

class NoteAdapter(
    private val frag: NoteFragment,
    private var notes: ArrayList<Note> = arrayListOf()
) :
    RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val noteTitle = itemView.tv_Title!!
        val noteNote = itemView.tv_Note!!
        val notePriority = itemView.tv_Priority!!
        val noteEdit = itemView.iv_Edit!!
        val noteDelete = itemView.iv_Delete!!
        val notePicture = itemView.iv_AddPicture!!
        val noteImage = itemView.iv_NoteImage!!
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        NoteViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.note_item,
                    parent,
                    false
                )
        )

    override fun getItemCount() = notes.size

    fun setNotes(notes: List<Note>) {
        this.notes.clear()
        notes.forEach { this.notes.add(it) }
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

        val currentNote = notes[position]
        holder.noteTitle.text = currentNote.title
        holder.noteNote.text = currentNote.description
        holder.notePriority.text = currentNote.priority.toString()
        holder.noteDelete.setOnClickListener { frag.delNote(currentNote) }
        holder.noteEdit.setOnClickListener { frag.editNote(currentNote) }
        holder.notePicture.setOnClickListener { frag.getPicture(currentNote) }
        when{currentNote.image != ""-> GetBitmap(
            holder.noteImage,
            currentNote.image
        ).execute()}
        holder.noteImage.setOnClickListener { frag.showImage(currentNote) }
    }
}

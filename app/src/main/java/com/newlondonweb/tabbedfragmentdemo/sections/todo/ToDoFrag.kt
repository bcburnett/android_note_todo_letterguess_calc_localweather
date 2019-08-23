package com.newlondonweb.tabbedfragmentdemo.sections.todo

import android.content.DialogInterface
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.R.layout.fragment_to_do
import com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo
import kotlinx.android.synthetic.main.fragment_to_do.*
import kotlinx.android.synthetic.main.layout_add.view.*
import kotlinx.android.synthetic.main.layout_add.view.et_details
import kotlinx.android.synthetic.main.layout_add.view.et_priority
import kotlinx.android.synthetic.main.layout_add.view.et_title
import kotlinx.android.synthetic.main.layout_popup.view.*
import kotlinx.coroutines.launch


class ToDoFrag : Fragment() {
    companion object {
        fun newInstance() = ToDoFrag()
    }
    private val vm: TodoViewModel by lazy {this.activity.let { ViewModelProvider(it!!).get(
        TodoViewModel::class.java)}}
    private val va: TodoAdapter =
        TodoAdapter(frag = this)


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
            fragment_to_do,
            container,
            false
        )


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val recyclerView = rv_Todos
        recyclerView.layoutManager = GridLayoutManager(this.context, 1)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = va

        vm.allTodos.observe(this, Observer {
            va.setTodos(it)
        })

        iv_AddTodo.setOnClickListener { newTodo() }
    }


    fun delTodo(currentNote: Todo) {
        activity?.let {
            AlertDialog.Builder(it)
                .setTitle("Delete Todo")
                .setMessage("Do you really want to delete this todo?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(R.string.delete) { _: DialogInterface, _: Int ->
                    vm.viewModelScope.launch { vm.delete(currentNote) }
                }
                .setNegativeButton(android.R.string.no, null).show()
        }
    }

    fun editTodo(currentNote: Todo) {

        window.dismiss()
        val view = layoutInflater.inflate(R.layout.layout_popup, this.frameLayout,false)
        view.et_title.setText(currentNote.title)
        view.et_details.setText(currentNote.description)
        view.et_priority.setText(currentNote.priority.toString())
        view.btn_Edit.setOnClickListener {
            vm.viewModelScope.launch {
                vm.update(
                    Todo(
                        priority = view.et_priority.text.toString().toInt(),
                        description = view.et_details.text.toString(),
                        title = view.et_title.text.toString(),
                        done = currentNote.done,
                        id = currentNote.id
                    )
                )
            }
            window.dismiss()
        }
        view.btn_edit_Cancel.setOnClickListener { window.dismiss() }
        window.contentView = view
        window.showAsDropDown(guideline)

    }

    fun todoToggle(currentTodo: Todo) {
        vm.viewModelScope.launch {
            vm.update(
                Todo(
                    priority = currentTodo.priority,
                    description = currentTodo.description,
                    title = currentTodo.title,
                    id = currentTodo.id,
                    done = !currentTodo.done
                )
            )
        }
    }

    private fun newTodo() {

        window.dismiss()
        val view = layoutInflater.inflate(R.layout.layout_add,this.frameLayout,false)
        view.btn_Add.setOnClickListener {
            vm.viewModelScope.launch {
                vm.insert(
                    Todo(
                        priority = view.et_priority.text.toString().toInt(),
                        description = view.et_details.text.toString(),
                        title = view.et_title.text.toString()
                    )
                )
            }
            window.dismiss()
        }
        view.btn_Cancel.setOnClickListener { window.dismiss() }
        window.contentView = view
        window.showAsDropDown(guideline)

    }

}

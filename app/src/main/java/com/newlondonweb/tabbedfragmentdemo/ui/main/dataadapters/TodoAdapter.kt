package com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.data.todo.Todo
import com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag
import kotlinx.android.synthetic.main.todo_item.view.*

class TodoAdapter(
    private val frag: ToDoFrag,
    private var todos: List<Todo> = ArrayList()
) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return TodoViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentTodo = todos[position]
        holder.todoTitle.text = currentTodo.title
        holder.todoNote.text = currentTodo.description
        holder.todoPriority.text = currentTodo.priority.toString()
        holder.todoDelete.setOnClickListener { frag.delTodo(currentTodo) }
        holder.todoEdit.setOnClickListener { frag.editTodo(currentTodo) }
        holder.todoDone.setOnClickListener { frag.todoToggle(currentTodo) }
        when {
            currentTodo.done -> {
                holder.todoTitle.setBackgroundResource(R.color.nlw50grey )
                holder.todoDone.setImageResource(R.drawable.ic_check_box_black_24dp)
            }
            else -> {
                holder.todoTitle.setBackgroundResource(R.color.nlw75grey)
                holder.todoDone.setImageResource(R.drawable.ic_check_box_outline_blank_black_24dp)
            }
        }
    }

    fun setTodos(todos: List<Todo>) {
        this.todos = todos
        notifyDataSetChanged()
    }

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val todoTitle = itemView.tv_TodoTitle!!
        val todoNote = itemView.tv_TodoNote!!
        val todoPriority = itemView.tv_TodoPriority!!
        val todoEdit = itemView.iv_TodoEdit!!
        val todoDelete = itemView.iv_TodoDelete!!
        val todoDone = itemView.iv_TodoDone!!
    }
}

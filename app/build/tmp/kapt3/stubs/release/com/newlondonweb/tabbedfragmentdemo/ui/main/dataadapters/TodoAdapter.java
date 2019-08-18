package com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/TodoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/TodoAdapter$TodoViewHolder;", "frag", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/ToDoFrag;", "todos", "", "Lcom/newlondonweb/tabbedfragmentdemo/data/todo/Todo;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/ToDoFrag;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTodos", "TodoViewHolder", "app_release"})
public final class TodoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.TodoAdapter.TodoViewHolder> {
    private final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag frag = null;
    private java.util.List<com.newlondonweb.tabbedfragmentdemo.data.todo.Todo> todos;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.TodoAdapter.TodoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.TodoAdapter.TodoViewHolder holder, int position) {
    }
    
    public final void setTodos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newlondonweb.tabbedfragmentdemo.data.todo.Todo> todos) {
    }
    
    public TodoAdapter(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag frag, @org.jetbrains.annotations.NotNull()
    java.util.List<com.newlondonweb.tabbedfragmentdemo.data.todo.Todo> todos) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/TodoAdapter$TodoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/TodoAdapter;Landroid/view/View;)V", "todoDelete", "Landroid/widget/ImageView;", "getTodoDelete", "()Landroid/widget/ImageView;", "todoDone", "getTodoDone", "todoEdit", "getTodoEdit", "todoNote", "Landroid/widget/TextView;", "getTodoNote", "()Landroid/widget/TextView;", "todoPriority", "getTodoPriority", "todoTitle", "getTodoTitle", "app_release"})
    public final class TodoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView todoTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView todoNote = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView todoPriority = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView todoEdit = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView todoDelete = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView todoDone = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTodoTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTodoNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTodoPriority() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getTodoEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getTodoDelete() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getTodoDone() {
            return null;
        }
        
        public TodoViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
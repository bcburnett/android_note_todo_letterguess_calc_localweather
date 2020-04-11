package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/ToDoFrag;", "Landroidx/fragment/app/Fragment;", "()V", "va", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/TodoAdapter;", "vm", "Lcom/newlondonweb/tabbedfragmentdemo/viewModels/TodoViewModel;", "getVm", "()Lcom/newlondonweb/tabbedfragmentdemo/viewModels/TodoViewModel;", "vm$delegate", "Lkotlin/Lazy;", "window", "Landroid/widget/PopupWindow;", "delTodo", "", "currentNote", "Lcom/newlondonweb/tabbedfragmentdemo/data/todo/Todo;", "editTodo", "newTodo", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "todoToggle", "currentTodo", "Companion", "app_debug"})
public final class ToDoFrag extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy vm$delegate = null;
    private final com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.TodoAdapter va = null;
    private final android.widget.PopupWindow window = null;
    private static volatile com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag INSTANCE;
    public static final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.newlondonweb.tabbedfragmentdemo.viewModels.TodoViewModel getVm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void delTodo(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo currentNote) {
    }
    
    public final void editTodo(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo currentNote) {
    }
    
    public final void todoToggle(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo currentTodo) {
    }
    
    private final void newTodo() {
    }
    
    public ToDoFrag() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/ToDoFrag$Companion;", "", "()V", "INSTANCE", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/ToDoFrag;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.ToDoFrag getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
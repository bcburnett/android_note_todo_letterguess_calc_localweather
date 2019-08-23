package com.newlondonweb.tabbedfragmentdemo.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository;", "", "noteDao", "Lcom/newlondonweb/tabbedfragmentdemo/sections/notes/notes/NoteDao;", "todoDao", "Lcom/newlondonweb/tabbedfragmentdemo/sections/todo/todo/TodoDao;", "(Lcom/newlondonweb/tabbedfragmentdemo/sections/notes/notes/NoteDao;Lcom/newlondonweb/tabbedfragmentdemo/sections/todo/todo/TodoDao;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/newlondonweb/tabbedfragmentdemo/sections/notes/notes/Note;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "allTodos", "Lcom/newlondonweb/tabbedfragmentdemo/sections/todo/todo/Todo;", "getAllTodos", "getNoteDao", "()Lcom/newlondonweb/tabbedfragmentdemo/sections/notes/notes/NoteDao;", "getTodoDao", "()Lcom/newlondonweb/tabbedfragmentdemo/sections/todo/todo/TodoDao;", "delete", "", "note", "(Lcom/newlondonweb/tabbedfragmentdemo/sections/notes/notes/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todo", "(Lcom/newlondonweb/tabbedfragmentdemo/sections/todo/todo/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "update", "Companion", "app_debug"})
public final class AppRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.NoteDao noteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.TodoDao todoDao = null;
    private static volatile com.newlondonweb.tabbedfragmentdemo.data.AppRepository INSTANCE;
    public static final com.newlondonweb.tabbedfragmentdemo.data.AppRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo>> getAllTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.NoteDao getNoteDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.TodoDao getTodoDao() {
        return null;
    }
    
    public AppRepository(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.notes.notes.NoteDao noteDao, @org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.sections.todo.todo.TodoDao todoDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository$Companion;", "", "()V", "INSTANCE", "Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository;", "newInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.newlondonweb.tabbedfragmentdemo.data.AppRepository newInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
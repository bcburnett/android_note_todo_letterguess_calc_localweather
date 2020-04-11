package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bJ\u0019\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "currentNote", "getCurrentNote$app_debug", "myNote", "Landroidx/lifecycle/MutableLiveData;", "repository", "Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository;", "delete", "", "note", "(Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "setCurrentNote", "update", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.newlondonweb.tabbedfragmentdemo.data.AppRepository repository = null;
    private androidx.lifecycle.MutableLiveData<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> myNote;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.newlondonweb.tabbedfragmentdemo.data.notes.Note>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> getCurrentNote$app_debug() {
        return null;
    }
    
    public final void setCurrentNote(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
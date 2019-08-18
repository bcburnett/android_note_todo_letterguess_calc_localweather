package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0019\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\u001dJ\u0019\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000e0\u000e0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "currentNote", "getCurrentNote$app_release", "frag1Data", "", "getFrag1Data", "frag1TimeDisplay", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "myNote", "repository", "Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository;", "runTimer", "", "getRunTimer", "()Z", "setRunTimer", "(Z)V", "delete", "", "note", "(Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doTimer", "insert", "setCurrentNote", "stopTimer", "update", "app_release"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> frag1TimeDisplay = null;
    private boolean runTimer;
    private final com.newlondonweb.tabbedfragmentdemo.data.AppRepository repository = null;
    private androidx.lifecycle.MutableLiveData<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> myNote;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFrag1Data() {
        return null;
    }
    
    public final boolean getRunTimer() {
        return false;
    }
    
    public final void setRunTimer(boolean p0) {
    }
    
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
    public final androidx.lifecycle.LiveData<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> getCurrentNote$app_release() {
        return null;
    }
    
    public final void setCurrentNote(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    public final void doTimer() {
    }
    
    public final void stopTimer() {
    }
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
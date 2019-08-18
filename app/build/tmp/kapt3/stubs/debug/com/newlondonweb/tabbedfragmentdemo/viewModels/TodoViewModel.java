package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0019\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001f\u001a\u00020\u001aJ\u0019\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\f0\f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/TodoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allTodos", "Landroidx/lifecycle/LiveData;", "", "Lcom/newlondonweb/tabbedfragmentdemo/data/todo/Todo;", "getAllTodos", "()Landroidx/lifecycle/LiveData;", "frag1Data", "", "getFrag1Data", "frag1TimeDisplay", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "repository", "Lcom/newlondonweb/tabbedfragmentdemo/data/AppRepository;", "runTimer", "", "getRunTimer", "()Z", "setRunTimer", "(Z)V", "delete", "", "todo", "(Lcom/newlondonweb/tabbedfragmentdemo/data/todo/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doTimer", "insert", "stopTimer", "update", "app_debug"})
public final class TodoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> frag1TimeDisplay = null;
    private boolean runTimer;
    private final com.newlondonweb.tabbedfragmentdemo.data.AppRepository repository = null;
    
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
    public final androidx.lifecycle.LiveData<java.util.List<com.newlondonweb.tabbedfragmentdemo.data.todo.Todo>> getAllTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.todo.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void doTimer() {
    }
    
    public final void stopTimer() {
    }
    
    public TodoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
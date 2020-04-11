package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0015R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/CalcViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "calculatorDisplay", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "display", "Landroidx/lifecycle/LiveData;", "getDisplay$app_debug", "()Landroidx/lifecycle/LiveData;", "firstNum", "", "oper", "secondNum", "tally", "tallyRegister", "getTallyRegister$app_debug", "ac", "", "doTally", "command", "message", "eq", "flip", "funClick", "s", "numClick", "percent", "sqrt", "app_debug"})
public final class CalcViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> calculatorDisplay = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> tally = null;
    private double firstNum = 0.0;
    private double secondNum = 0.0;
    private java.lang.String oper = "+";
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDisplay$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTallyRegister$app_debug() {
        return null;
    }
    
    public final void ac() {
    }
    
    public final void eq() {
    }
    
    public final void numClick(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void funClick(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public final void percent() {
    }
    
    public final void flip() {
    }
    
    public final void sqrt() {
    }
    
    public final void doTally(@org.jetbrains.annotations.NotNull()
    java.lang.String command, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public CalcViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
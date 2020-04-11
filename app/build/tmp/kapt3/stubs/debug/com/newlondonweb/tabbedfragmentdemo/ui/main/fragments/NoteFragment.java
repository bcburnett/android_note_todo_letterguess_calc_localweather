package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/NoteFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "REQUEST_TAKE_PHOTO", "", "currentPhotoPath", "", "mfile", "Ljava/io/File;", "va", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/NoteAdapter;", "vm", "Lcom/newlondonweb/tabbedfragmentdemo/viewModels/NoteViewModel;", "getVm", "()Lcom/newlondonweb/tabbedfragmentdemo/viewModels/NoteViewModel;", "vm$delegate", "Lkotlin/Lazy;", "window", "Landroid/widget/PopupWindow;", "delNote", "", "currentNote", "Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;", "editNote", "getPicture", "newNote", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showImage", "startCamera", "Companion", "app_debug"})
public final class NoteFragment extends androidx.fragment.app.Fragment implements androidx.lifecycle.LifecycleOwner {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    private final com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.NoteAdapter va = null;
    private java.io.File mfile;
    private final int REQUEST_TAKE_PHOTO = 10;
    private java.lang.String currentPhotoPath = "";
    private final android.widget.PopupWindow window = null;
    private static volatile com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.NoteFragment INSTANCE;
    public static final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.NoteFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.newlondonweb.tabbedfragmentdemo.viewModels.NoteViewModel getVm() {
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
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void editNote(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    private final void newNote() {
    }
    
    public final void delNote(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    public final void getPicture(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    private final void startCamera() {
    }
    
    public final void showImage(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.data.notes.Note currentNote) {
    }
    
    public NoteFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/NoteFragment$Companion;", "", "()V", "INSTANCE", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/NoteFragment;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.NoteFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
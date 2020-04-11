package com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/NoteAdapter$NoteViewHolder;", "frag", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/NoteFragment;", "notes", "Ljava/util/ArrayList;", "Lcom/newlondonweb/tabbedfragmentdemo/data/notes/Note;", "Lkotlin/collections/ArrayList;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/NoteFragment;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNotes", "", "NoteViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.NoteAdapter.NoteViewHolder> {
    private final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.NoteFragment frag = null;
    private java.util.ArrayList<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> notes;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> notes) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.NoteFragment frag, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newlondonweb.tabbedfragmentdemo.data.notes.Note> notes) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/NoteAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/NoteAdapter;Landroid/view/View;)V", "noteDelete", "Landroid/widget/ImageView;", "getNoteDelete", "()Landroid/widget/ImageView;", "noteEdit", "getNoteEdit", "noteImage", "getNoteImage", "noteNote", "Landroid/widget/TextView;", "getNoteNote", "()Landroid/widget/TextView;", "notePicture", "getNotePicture", "notePriority", "getNotePriority", "noteTitle", "getNoteTitle", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView noteTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView noteNote = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView notePriority = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView noteEdit = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView noteDelete = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView notePicture = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView noteImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNoteTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNoteNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNotePriority() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getNoteEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getNoteDelete() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getNotePicture() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getNoteImage() {
            return null;
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
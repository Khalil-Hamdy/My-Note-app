package com.khalil.notes.listener;

import com.khalil.notes.entites.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);
}

package com.khalil.notes.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.khalil.notes.dao.NoteDao;
import com.khalil.notes.entites.Note;

@Database(entities = Note.class , version = 1 , exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {

    private static NotesDatabase notesDatabase;

    public static synchronized NotesDatabase getDatabase(Context context){
        if(notesDatabase==null){
            notesDatabase = Room.databaseBuilder(
                    context,
                    NotesDatabase.class,
                    "notes-db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();

}

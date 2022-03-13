package ir.moris.justasimpletodoapp.feature_note.data.data_scource

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.moris.justasimpletodoapp.feature_note.domain.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = true)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao


    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
package ir.moris.justasimpletodoapp.feature_note.presentation.notes

import ir.moris.justasimpletodoapp.feature_note.domain.model.Note
import ir.moris.justasimpletodoapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleNotesEvent : NotesEvent()
}
package app.presentation.note.addNote

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import app.presentation.note.addNote.components.AddContent
import app.presentation.note.addNote.components.AddTopBar
import app.presentation.note.model.NoteAction
import app.presentation.note.model.NoteState

@Composable
fun AddNoteScreen (
    onAction: (NoteAction) -> Unit,
    onSaveClick: () -> Unit,
    onBackClick: () -> Unit,
    notesState: NoteState
) {
    Scaffold (
        topBar = {
            AddTopBar(
                onAction = onAction,
                onSaveClick = {onSaveClick()},
                onBackClick = {onBackClick()},
                notesState = notesState
            )
        },
        content = { paddingValues ->
            AddContent(
                paddingValues = paddingValues,
                onAction = onAction,
                notesState = notesState
            )
        }
    )
}
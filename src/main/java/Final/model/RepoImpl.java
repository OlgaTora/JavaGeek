package Final.model;

import java.util.ArrayList;
import java.util.List;

public class RepoImpl implements Repo {
    private final FileOperations fileOperations;
    private final Mapper map;
    private final Utils utils;

    public RepoImpl(FileOperations fileOperations, Mapper map, Utils utils) {
        this.fileOperations = fileOperations;
        this.map = map;
        this.utils = utils;
    }

    public void createNote(Note note) {
        List<Note> notes = readNotes();
        String newId = utils.getNewId(notes);
        note.setId(newId);
        String uniqId = utils.getUniqID();
        note.setUniqID(uniqId);
        notes.add(note);
        saveToRepo(notes);
    }

    public List<Note> readNotes() {
        List<String> lines = fileOperations.readFile();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            Note newNote = map.map(line);
            notes.add(newNote);
        }
        return notes;
    }

    @Override
    public Note readNote(String id) throws Exception {
        List<Note> notes = readNotes();
        return utils.findNoteById(id, notes);
    }

    @Override
    public void deleteNote(String id) throws Exception {
        List<Note> notes = readNotes();
        Note noteToDelete = utils.findNoteById(id, notes);
        notes.remove(noteToDelete);
        saveToRepo(notes);
    }

    @Override
    public void updateHeading(String id, String heading) throws Exception {
        List<Note> notes = readNotes();
        Note noteToUpdate = utils.findNoteById(id, notes);
        noteToUpdate.setHeader(heading);
        saveToRepo(notes);
    }

    public void updateContent(String id, String text) throws Exception {
        List<Note> notes = readNotes();
        Note noteToUpdate = utils.findNoteById(id, notes);
        noteToUpdate.setContent(text);
        saveToRepo(notes);
    }

    private void saveToRepo(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note note : notes) {
            lines.add(map.map(note));
        }
        fileOperations.saveFile(lines);
    }
}


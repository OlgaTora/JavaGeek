package Final.model;

import Final.model.mapper.Mapper;

import java.util.ArrayList;
import java.util.List;

public class RepoImpl implements Repo {
    private final FileOperations fileOperations;
    private final Mapper map;
    private final Utils utils;
    private final BaseLogger logger;

    public RepoImpl(FileOperations fileOperations, Mapper map, Utils utils, BaseLogger logger) {
        this.fileOperations = fileOperations;
        this.map = map;
        this.utils = utils;
        this.logger = logger;
    }

    public void createNote(Note note) {
        List<Note> notes = readNotes();
        String newId = utils.getNewId(notes);
        note.setId(newId);
        String uniqId = utils.getUniqID();
        note.setUniqID(uniqId);
        String time = note.currentTimestamp();
        note.setTime(time);
        notes.add(note);
        saveToLogger(note, "new");
        saveToRepo(notes);
    }

    public void saveToLogger(Note note, String comment) {
        List<String> log = new ArrayList<>();
        log.add(comment + "," + note.getUniqID());
        logger.saveFile(log);
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
        saveToLogger(noteToDelete, "delete");
        notes.remove(noteToDelete);
        saveToRepo(notes);
    }

    @Override
    public void updateHeading(String id, String heading) throws Exception {
        List<Note> notes = readNotes();
        Note noteToUpdate = utils.findNoteById(id, notes);
        saveToLogger(noteToUpdate, "updatehead");
        noteToUpdate.setHeader(heading);
        saveToRepo(notes);
    }

    public void updateContent(String id, String text) throws Exception {
        List<Note> notes = readNotes();
        Note noteToUpdate = utils.findNoteById(id, notes);
        saveToLogger(noteToUpdate, "updatecontent");
        noteToUpdate.setContent(text);
        saveToRepo(notes);
    }

    @Override
    public List<String> readLogger() {
        List<String> logs = logger.readFile();
        return logs;
    }

    private void saveToRepo(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note note : notes) {
            lines.add(map.map(note));
        }
        fileOperations.saveFile(lines);
    }
}


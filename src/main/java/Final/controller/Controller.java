package Final.controller;

import Final.model.HelpMenu;
import Final.model.Note;
import Final.model.Repo;

import java.util.List;


public class Controller {
    private final Repo repository;
    private final HelpMenu help;

    public Controller(Repo repository, HelpMenu help) {
        this.repository = repository;
        this.help = help;
    }

    public void createNote(Note note) {
        repository.createNote(note);
    }

    public List<Note> readNotes() {
        return repository.readNotes();
    }

    public Note readNote(String id) throws Exception {
        return repository.readNote(id);
    }

    public void help() {
        help.help();
    }

    public void deleteNote(String id) throws Exception {
        repository.deleteNote(id);
    }

    public void updateHeading(String id, String heading) throws Exception {
        repository.updateHeading(id, heading);
    }

    public void updateContent(String id, String text) throws Exception {
        repository.updateContent(id, text);
    }
}


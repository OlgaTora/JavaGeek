package Final.model;

import java.util.List;

public interface Repo {
    void createNote(Note note);

    List<Note> readNotes();

    Note readNote(String id) throws Exception;

    void deleteNote(String id) throws Exception;

    void updateHeading(String id, String heading) throws Exception;

    void updateContent(String id, String text) throws Exception;
}

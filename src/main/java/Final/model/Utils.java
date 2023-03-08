package Final.model;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Utils {
    protected String getNewId(List<Note> notes) {
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        return String.format("%d", newId);
    }

    protected String getUniqID() {
        return String.format("%s", UUID.randomUUID());
    }

    protected Note findNoteById(String id, List<Note> notes) throws Exception {
        for (Note note : notes
        ) {
            if (Objects.equals(id, note.getId())) {
                return note;
            }
        }
        throw new Exception("User not found");
    }
}

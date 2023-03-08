package Final.model.mapper;

import Final.model.Note;

public interface Mapper {

    String map(Note note);

    Note map(String line);

}


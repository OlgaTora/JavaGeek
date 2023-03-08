package Final.model.mapper;

import Final.model.Note;

public class MapperImpl implements Mapper {
    @Override
    public String map(Note note) {
        return String.format("%s,%s,%s,%s,%s", note.getId()
                , note.getUniqID(), note.getHeader(), note.getContent(), note.getTime());
    }

    @Override
    public Note map(String line) {
        String[] lines = line.split(",");
        //String[] lines = line.split("[,;.:]|; ");
        return new Note(lines[0], lines[1], lines[2], lines[3], lines[4]);
    }

}
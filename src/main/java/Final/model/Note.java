package Final.model;

import java.time.LocalDate;

public class Note implements Dateable {
    private String id;
    private String uniqID;
    private String header;
    private String content;
    private String time;

    public Note(String id, String uniqID, String header, String content, String time) {
        this.id = id;
        this.uniqID = uniqID;
        this.header = header;
        this.content = content;
        this.time = time;
    }

    public Note(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return String.format("""
                UniqueId: %s
                Heading: %s
                Time: %s
                Text: %s""", uniqID, header, time, content);
    }

    public String getUniqID() {
        return uniqID;
    }

    public void setUniqID(String uniqID) {
        this.uniqID = uniqID;
    }

    @Override
    public String currentTimestamp() {
        return String.valueOf(LocalDate.now());
    }
}


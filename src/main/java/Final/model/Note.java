package Final.model;

public class Note {
    private String id;
    private String uniqID;
    private String header;
    private String content;
    public Note(String id, String uniqID, String header, String content) {
        this.id = id;
        this.uniqID = uniqID;
        this.header = header;
        this.content = content;
    }

    public Note(String header, String content) {
        this.header = header;
        this.content = content;
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
                Text: %s""", uniqID, header, content);
    }

    public String getUniqID() {
        return uniqID;
    }

    public void setUniqID(String uniqID) {
        this.uniqID = uniqID;
    }
}

package Final.model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class BaseLogger implements Dateable, FileOperations {
    protected final String fileName;

    public BaseLogger(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String currentTimestamp() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        DateFormat f = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        return f.format(c.getTime());
    }

    @Override
    public List<String> readFile() {
        List<String> log = new ArrayList<>();
        return log;
    }

    @Override
    public void saveFile(List<String> lines) {
    }
}


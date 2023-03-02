package Seminar11.calc.model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class LoggerImpl implements Logger {
    private String fileName;

    public LoggerImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String currentTimestamp() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        DateFormat f = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        return f.format(c.getTime());
    }

    public void saveLine(String result) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(result);
            writer.append(": ");
            writer.append(currentTimestamp());
            writer.append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
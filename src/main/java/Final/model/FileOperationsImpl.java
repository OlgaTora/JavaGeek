package Final.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationsImpl implements FileOperations {
    private final String fileName;

    public FileOperationsImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<String> readFile() {
        List<String> notes = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader
                    (new FileReader("notes.txt"));
            String line = in.readLine();
            if (line != null) {
                notes.add(line);
            }
            while (line != null) {
                line = in.readLine();
                if (line != null) {
                    notes.add(line);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notes;
    }

    @Override
    public void saveFile(List<String> lines) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            for (String line : lines) {
                fileWriter.write(line);
                fileWriter.append("\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


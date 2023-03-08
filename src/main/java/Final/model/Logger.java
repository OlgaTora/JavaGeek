package Final.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Logger extends BaseLogger {
    public Logger(String fileName) {
        super(fileName);
    }

    public void saveFile(List<String> lines) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (String line : lines) {
                writer.write(line);
                writer.append(",");
                writer.append(currentTimestamp());
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> readFile() {
        List<String> logs = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader
                    (new FileReader(fileName));
            String line = in.readLine();
            if (line != null) {
                logs.add(line);
            }
            while (line != null) {
                line = in.readLine();
                if (line != null) {
                    logs.add(line);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logs;
    }
}



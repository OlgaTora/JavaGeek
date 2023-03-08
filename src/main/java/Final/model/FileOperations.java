package Final.model;

import java.util.List;

public interface FileOperations {
    List<String> readFile();

    void saveFile(List<String> lines);
}
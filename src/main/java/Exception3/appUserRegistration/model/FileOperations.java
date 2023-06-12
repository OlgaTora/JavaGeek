package Exception3.appUserRegistration.model;

import java.io.*;
import java.util.ArrayList;

public class FileOperations {

    public FileOperations() {
    }

    public void saveFile(String user, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(user);
            fileWriter.append("\n");
            fileWriter.append("--------");
            fileWriter.append("\n");

//            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Error during file saving" + e.getMessage());
        }
    }

    public ArrayList<String> readFile(String fileName, String encoding) {
        ArrayList<String> names = new ArrayList<>();
        File file = new File(fileName);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}

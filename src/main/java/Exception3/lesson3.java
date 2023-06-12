package Exception3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\вяаы\\IdeaProjects\\JavaSeminars\\src\\main\\java\\Exception2\\seminar2\\test.txt");
             FileWriter writer = new FileWriter("testWriter")) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("exception" + e.getClass().getSimpleName());
        }
        System.out.println("Success copied");
    }
}




package Exception2.seminar2;
    /*
Исправьте код, примените подходящие способы обработки исключений.

*/

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[strings.length - 1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        // для 1/0
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен");
        // для test и fileInputStream  - общее исключение
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("l");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}



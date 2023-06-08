package Exception2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class lesson2 {
    public static void main(String[] args) {
        //NullPointerException
        String s = null;
        //System.out.println(s.length());

        //ClassCastException
        Object object = new String("123");
        //File file = (File) object;
        //System.out.println(file);

        //NumberFormatException
        String number = "123as";
        //Integer.parseInt(number);

        // UnsupportedOperationException
        List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());

        int num = 1;
        try {
            num = 10 / 1;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e) {
            System.out.println("DIVISION by ZERO");
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
        System.out.println(num);

        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("exception" + e.getClass().getSimpleName());
        } finally {
            if (test != null) {
                try {
                    System.out.println("finally start");
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
        }
        System.out.println("finally open");
    }
}

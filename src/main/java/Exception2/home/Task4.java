package Exception2.home;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Input something: ");
            boolean result = isNotEmptyInput1(iScanner);
            if (result) {
                System.out.println("Its OK");
            }
//            isNotEmptyInput2(iScanner);
        } catch (IOException e) {
            System.out.println("You have a input mistake");
        }
    }

    // Version without loop and with exception
    static void isNotEmptyInput2(Scanner iScanner) throws IOException {
        String str = iScanner.nextLine();
        if (!str.isEmpty()) {
            System.out.println("Its OK");
            iScanner.close();
        } else {
            throw new RuntimeException("Empty string");
        }

    }

    // Version with loop, it's more comfortable don't stop application
    static boolean isNotEmptyInput1(Scanner iScanner) throws IOException {
        boolean result = false;
        String str;
        while (iScanner.hasNextLine()) {
            str = iScanner.nextLine();
            if (str.isEmpty()) {
                System.out.println("Empty string! Try again!");
            } else {
                result = true;
                break;
            }
        }
        iScanner.close();
        return result;
    }
}

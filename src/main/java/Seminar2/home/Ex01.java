/* Напишите метод, который принимает на вход строку (String) и определяет является
ли строка палиндромом (возвращает boolean значение).*/

package Seminar2.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Input your word to check: ");
            String str = isValidValue(iScanner);
            System.out.println(isPalindrom(str));
        }
    }

    static String isValidValue(Scanner iScanner) {
        String str = null;
        while (iScanner.hasNextLine()) {
            try {
                str = iScanner.next("[a-zA-Z]+");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value! Try again!");
                e.printStackTrace();
                iScanner.nextLine();
            }
        }
        return str;
    }

    public static boolean isPalindrom(String str) {
        String strReverse = "";

        char[] letters = str.toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {
            strReverse = strReverse.concat(String.valueOf(letters[i]));
        }
        return str.equals(strReverse);
    }
}

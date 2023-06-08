package Exception2.home;

import java.io.IOException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Input float number for check: ");
            float result = isValidValue(iScanner);
            System.out.printf("Operation is done, your number is %f", result);
        } catch (IOException e) {
            System.out.println("You have a mistake in input operation");
        }
    }

    static float isValidValue(Scanner iScanner) throws IOException {
        boolean doContinue = true;
        float number = 0;
        while (doContinue) {
            try {
                number = Float.parseFloat(iScanner.next());
                System.out.println(number);
                doContinue = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Try again!" + e);
            }
        }
        iScanner.close();
        return number;
    }
}

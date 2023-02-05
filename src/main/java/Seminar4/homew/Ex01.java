package Seminar4.homew;

    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        stringRemember();
    }


    private static void stringRemember() {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> list = new ArrayDeque<>();

        while (true) {
            System.out.print("Input string: ");
            String inputString = scanner.nextLine();

            if (inputString.length() == 0) {
                System.out.println("The string is null. Error!");
                continue;
            }

            if (inputString.equals("quit")) {
                System.exit(0);
            }

            if (inputString.equals("revert")) {
                System.out.println("Remove last string: " + list.getFirst());
                list.removeFirst();
                System.out.println(list);
            } else if (inputString.equals("print")) {
                System.out.println("Your list is:" + list);
            } else {
                list.addFirst(inputString);
            }
        }
    }
}

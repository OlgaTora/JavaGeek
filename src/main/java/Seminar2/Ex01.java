package Seminar2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        ex1();
    }

    // Дано число N длина строки и символы с1 и с2. Составить строку из чередующихся символов
    public static void ex1() {
        Scanner lineScanner = new Scanner(System.in);
        int n = -1;

        do {
            System.out.print("Input length of string: ");

            try {
                n = lineScanner.nextInt();
            } catch (Exception var11) {
                System.out.println("You've a mistake! Try again ");
                var11.printStackTrace();
            }
        } while (n <= 0);

        System.out.print("Input first char: ");
        String c1String = "";

        try {
            c1String = lineScanner.next();
        } catch (Exception var10) {
            System.out.print("Ошибка! ");
        }

        System.out.print("Input second char: ");
        String c2String = "";

        try {
            c2String = lineScanner.next();
        } catch (Exception var9) {
            System.out.print("Invalid value! ");
        }

        lineScanner.close();
        char c1 = c1String.charAt(0);
        char c2 = c2String.charAt(0);
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }

        System.out.println(sb);
    }
}

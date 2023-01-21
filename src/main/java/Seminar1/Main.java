package Seminar1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        System.exit(-1);
    }

    public static void ex2() {
        int[] binaryArray = new int[1000];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }
        for (int num : binaryArray) {
            if (num == 1) {
                counter++;
            } else {
                maxLength = (counter > maxLength) ? counter : maxLength;
                counter = 0;
            }
        }
        System.out.println("Max length = " + Math.max(counter, maxLength));
    }

    private static void ex1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!%n", name);
        iScanner.close();
    }

}


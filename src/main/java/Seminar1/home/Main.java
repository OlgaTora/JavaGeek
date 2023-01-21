package Seminar1.home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        System.exit(-1);
    }

    // Поиск мин и макс в произвольном массиве
    private static void ex1() {
        int[] myArray = new int[30];
        int maxNum = 0;
        int minNum = 0;
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(-100, 100);
        }
        System.out.println("List for check: " + Arrays.toString(myArray));
        for (int num : myArray) {
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Min = " + minNum + " Max = " + maxNum);
    }

    // Високосный год
    private static void ex2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input any year: ");
        short year = iScanner.nextShort();
        iScanner.close();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    // Дан массив и число val = 3. Элементы равные данному перенести в конец массива.
    private static void ex3() {
        short val = 3;
        int[] myArray = new int[]{2, 3, 5, 33, 3, 3, 11, 1, 4, 3, 3, 4, 3, 66, 3, 2, 99, 3, 5, 3, 3, 5};
        // для проверки условия
        //int[] myArray = new int[]{0, 0, 0};

        System.out.println("Array to check: " + Arrays.toString(myArray));
        int i = 0;
        int j = 0;
        int leftNum = myArray[0];
        int rightNum = myArray[myArray.length - 1];
        boolean contains = IntStream.of(myArray).anyMatch(x -> x == 4);
        if (contains) {
            while (i + j < myArray.length) {
                if (rightNum != val) {
                    if (leftNum == val) {
                        myArray[myArray.length - 1 - j] = leftNum;
                        myArray[i] = rightNum;
                        i++;
                        j++;
                        rightNum = myArray[myArray.length - 1 - j];
                    } else {
                        i++;
                    }
                    leftNum = myArray[i];
                } else {
                    j++;
                    rightNum = myArray[myArray.length - 1 - j];
                }
            }
            System.out.println("Result array:   " + Arrays.toString(myArray));
        } else {
            System.out.println("Your list not contains number 3");
        }
    }
}
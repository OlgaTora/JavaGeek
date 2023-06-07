package Exception1.home;

import static Exception1.home.Task2.getDiff;
import static Exception1.home.Task3.getQuotient;


public class Main {
    public static void main(String[] args) {
        System.out.println("Task 0");
        int[] arr = {5, 6, 7, 8, 9, 0, 10};
        //System.out.println("Result is: " + sumElemArray(arr));
        //System.out.println("Result is: " + divArray(arr));
        //System.out.println("Result is: " + convertor("OOO"));
        lines();
        System.out.println("Task 1");
        String[][] array = {{"1", "2"}, {"3", "4"}, {"1", "0"}};
        //System.out.println(sum2d(array));
        lines();
        System.out.println("Task 2");
        int[] array1 = {0, 1, 2};
        int[] array2 = {3, 0, 5};
        try {
            int[] resultDiff = getDiff(array1, array2);
            //    printArray(resultDiff);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        lines();
        System.out.println("Task 3");
        float[] resultQuotient = getQuotient(array1, array2);
        printArrayFloat(resultQuotient);
    }

    public static void lines() {
        System.out.println("_____________");
    }

    public static void printArray(int[] result) {
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void printArrayFloat(float[] result) {
        for (float v : result) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}

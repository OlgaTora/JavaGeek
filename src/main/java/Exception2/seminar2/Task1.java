package Exception2.seminar2;

import java.util.Arrays;
import java.util.Scanner;

/*
Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и обоснуйте свое решение.

*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//        int index = scanner.nextInt();
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Указан индекс за пределами массива");
//        }
        // не надо вызывать такой метод, нужно обрабоать исключения

        int index = 0;
        if (scanner.hasNextInt()){
            index = scanner.nextInt();
            if (index >= arr.length) {
                System.out.println("Указан индекс за пределами массива");
            }
            else {
                arr[index] = 1;
            }
        }
        else {
            System.out.println("Введите целое число!");
        }
        System.out.println(Arrays.toString(arr));
    }

}


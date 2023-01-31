/*
Заполнить массив из 10 чисел от 3 до 10 рандомно, отсортировать sort
и вывести массив на экран
 */

package Seminar3;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        int size = 10;
        ex01(size);
    }

    private static void ex01(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            int new_elem = random.nextInt(3, 11);
            list.add(new_elem);
        }
        list.sort(Comparator.naturalOrder());
        //Collections.sort(list);
        //list.sort(Integer::compare);
        System.out.println("Sorted list is: " + list);
    }
}

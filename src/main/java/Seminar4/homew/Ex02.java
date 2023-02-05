package Seminar4.homew;

    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */

import java.util.LinkedList;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        int size = createSize();
        reverseList(size);
    }

    private static void reverseList(int size) {
        LinkedList<String> list = createList(size);
        System.out.println("List for check: " + list);

        for (int i = 0; i < size / 2; i++) {
            String tmp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, tmp);
        }
        System.out.println("Reversed list: " + list);
    }

    private static LinkedList<String> createList(int size) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    private static int createSize() {
        Random random = new Random();
        return random.nextInt(2, 25);
    }
}
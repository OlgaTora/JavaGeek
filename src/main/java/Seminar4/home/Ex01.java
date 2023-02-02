package Seminar4.home;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex01(scanner);
        int size = createSize();
        ex02(size);
        ex03(size, scanner);
    }

    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
    private static void ex01(Scanner scanner) {
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

    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */
    private static void ex02(int size) {
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
        return random.nextInt(2,25);
    }
/*
Реализуйте очередь с помощью LinkedList с методами:
enqueue - помещает элемент в конец очереди
first - возвращает первый элемент
dequeue - возвращает первый элемент и удаляет его
 */

    private static void ex03(int size, Scanner scanner) {
        LinkedList<String> list = createList(size);
        System.out.println("List for check: " + list);
        System.out.println("Choose function: ");
        String inputFunc = scanner.nextLine();

        switch (inputFunc) {
            case "first" -> first(list);
            case "enqueue" -> enqueue(list, scanner);
            case "dequeue" -> dequeue(list);
            case "" -> System.out.println("Error! Your command is null!");
            default -> System.out.println("Error! Your command is not exist!");
        }
    }

    private static void dequeue(LinkedList<String> list) {
        first(list);
        list.removeFirst();
        System.out.println("List after remove: " + list);}

    private static void enqueue(LinkedList<String> list, Scanner scanner) {
        System.out.println("Input element: ");
        String inputString = scanner.nextLine();
        list.add(inputString);
        System.out.println("List after add: " + list);
    }

    private static void first(LinkedList<String> list) {
        System.out.println("The first element is: " + list.getFirst());
    }
}
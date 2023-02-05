package Seminar4.homew;

/*
Реализуйте очередь с помощью LinkedList с методами:
enqueue - помещает элемент в конец очереди
first - возвращает первый элемент
dequeue - возвращает первый элемент и удаляет его
 */

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = createSize();
        queueList(size, scanner);
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


    private static void queueList(int size, Scanner scanner) {
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
        System.out.println("List after remove: " + list);
    }

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
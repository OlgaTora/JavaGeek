package Seminar5.home;

import java.util.*;

// Тел книга с помощью Hashmap, чтобы у 1 человека более 1 номера
public class Ex01 {
    public static void main(String[] args) {
        createTelBook();
    }

    private static void createTelBook() {
        HashMap<String, List<Integer>> telBook = new HashMap<>();
        telBook.put("Ivanov", List.of(123, 456));
        telBook.put("Serov", List.of(1234, 4567));
        telBook.put("Pugachev", List.of(12345, 45678));
        System.out.println(telBook);
    }
}

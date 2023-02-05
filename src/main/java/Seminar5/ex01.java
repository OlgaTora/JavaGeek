package Seminar5;

import java.util.HashMap;

public class ex01 {
    public static void main(String[] args) {
        findPerson();
    }

    // Создать словарь, из него распечатать всех Ивановых
    private static void findPerson() {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(12345, "Ivanov");
        people.put(13345, "Petrov");
        people.put(15345, "Ivanov");
        people.put(16345, "Sidorov");
        people.put(17345, "Popov");
        people.put(18345, "Ivanov");
        people.put(19345, "Pupov");
        for (Integer key : people.keySet()) {
            if ("Ivanov".equals(people.get(key))) {
                System.out.printf("[%d: %s]\n", key, people.get(key));
            }
        }
    }
}
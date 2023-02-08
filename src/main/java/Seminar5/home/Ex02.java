package Seminar5.home;

/*
Пусть дан список сотрудников:
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        String[] listEmployees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        HashMap<String, Integer> nameMap = createMapOfEmployees(listEmployees);
        sortMapOfEmployees(nameMap);
        sortMapOfEmployees2(nameMap);
    }

    private static HashMap<String, Integer> createMapOfEmployees(String[] listEmployees) {
        ArrayList<String> listNames = new ArrayList<>();
        ArrayList<List> listNamesFamilies = new ArrayList<>();
        for (String listEmployee : listEmployees) {
            listNamesFamilies.add(List.of(listEmployee.split(" ")));
        }

        for (List listNamesFamily : listNamesFamilies) {
            Object name = listNamesFamily.get(0);
            listNames.add((String) name);
        }

        HashMap<String, Integer> nameMap = new HashMap<>();
        for (String listName : listNames) {
            if (!nameMap.containsKey(listName)) {
                nameMap.put(listName, 1);
            } else {
                nameMap.replace(listName, nameMap.get(listName) + 1);
            }
        }
        return nameMap;
    }

    private static void sortMapOfEmployees(HashMap<String, Integer> nameMap) {
        Map<String, Integer> sortedMap = nameMap.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);
    }

    private static void sortMapOfEmployees2(HashMap<String, Integer> nameMap) {
        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedMap);
    }
}
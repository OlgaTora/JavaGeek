package Seminar3.home;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        ex01();
        System.out.println("------------");
        ex02();
        System.out.println("------------");
        ex03();
    }

    //Пусть дан произвольный список целых чисел, удалить из него четные числа
    private static void ex01() {
        int size = 20;
        ArrayList<Integer> list = createArray(size);
        System.out.println("Random list ex01 is: " + list);
        ArrayList<Integer> cleanList = deleteOdd(list);
        System.out.println("List without odds: " + cleanList);

    }

    private static ArrayList<Integer> createArray(int size) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(-100, 100));
        }
        return list;
    }

    private static ArrayList<Integer> deleteOdd(ArrayList<Integer> list) {
        list.removeIf(x -> (x % 2 == 0));
        return list;
    }

    //Задан целочисленный список ArrayList. Найти мин, макс и среднее арифметическое.
    private static void ex02() {
        ArrayList<Integer> list = createArray(30);
        System.out.println("Random list ex02 is: " + list);
        System.out.println("Max of list is: " + searchMax(list));
        System.out.println("Min of list is: " + searchMin(list));
        System.out.println("Average is: " + searchAve(list));
    }

    private static String searchAve(ArrayList<Integer> list) {
        double ave;
        double sum = sumArray(list);
        ave = sum / list.size();
        return String.format("%.2f", ave);
    }

    private static int sumArray(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer d : list)
            sum += d;
        return sum;
    }

    private static int searchMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer integer : list) {
            min = integer < min ? integer : min;
        }
        return min;
    }

    private static int searchMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            max = integer > max ? integer : max;
        }
        return max;
    }

    //Пройти по рандомному списку из планет с урока и удалить повторяющиеся элементы.

    public static void ex03() {
        String[] solarSystemPlanets = {"Сатурн", "Плутон", "Солнце", "Марс", "Венера", "Юпитер", "Луна", "Земля", "Меркурий"};
        int size = 10;
        ArrayList<String> listOfPlanets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            listOfPlanets.add(solarSystemPlanets[random.nextInt(9)]);
        }

        System.out.println("For check ex03: " + listOfPlanets);
        System.out.println("Result ex03: " + planetsToSet(listOfPlanets));
    }

    private static ArrayList<String> planetsToSet(ArrayList<String> listOfPlanets) {
        listOfPlanets.sort(Comparator.naturalOrder());
        for (int i = 0; i < listOfPlanets.size() - 1; i++) {
            for (int j = i + 1; j < listOfPlanets.size(); j++) {
                if (Objects.equals(listOfPlanets.get(i), listOfPlanets.get(j))) {
                    listOfPlanets.set(j, "0");
                }
            }
        }
        String toRemove = "0";
        listOfPlanets.removeAll(Collections.singleton(toRemove));
/*
        Set<String> set = new HashSet<>(listOfPlanets);
        listOfPlanets.clear();
        listOfPlanets.addAll(set);
*/
        return listOfPlanets;
    }
}

/*
Создать список с планетами в произвольном порядке и повторяющимся.
Вывести каждую планету и сколько ее повторений
 */
package Seminar3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        int size = 30;
        String[] solarSystemPlanets = {"Сатурн", "Плутон", "Солнце", "Марс", "Венера", "Юпитер", "Луна", "Земля", "Меркурий"};
        ex02(size, solarSystemPlanets);
    }

    public static void ex02(int size, String[] solarSystemPlanets) {
        ArrayList<String> listOfPlanets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            listOfPlanets.add(solarSystemPlanets[random.nextInt(9)]);
        }
        System.out.println("For check: " + listOfPlanets);
        countPlanets(listOfPlanets, solarSystemPlanets);
    }


    private static void countPlanets(ArrayList<String> listOfPlanets, String[] solarSystemPlanets) {
        for (int j = 0; j < solarSystemPlanets.length; j++) {
            int counter = 0;
            String currPlanet = solarSystemPlanets[j];
            for (int i = 0; i < listOfPlanets.size(); i++) {
                if (Objects.equals(currPlanet, listOfPlanets.get(i))) {
                    ++counter;
                }
            }
            if (counter > 0) {
                System.out.println(currPlanet + " " + counter);
            }
        }
    }
}

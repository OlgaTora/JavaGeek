package Seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/*Заполнить массив случайно от 1 до 1000 на 1000 элементов
Вычислить % уникальных значений

 */
public class Ex01 {
    public static void main(String[] args) {
        int size = 1000;
        List<Integer> randomList = createList(size);
        countUniqInSet(randomList);
    }

    private static void countUniqInSet(List<Integer> randomList) {
        HashSet<Integer> hashSet = new HashSet<>(randomList);
        double uniqValues = hashSet.size() * 100 / ((double)randomList.size());
        System.out.println(uniqValues);
    }

    private static List<Integer> createList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(1, 1001));
        }
        return randomList;
    }
}

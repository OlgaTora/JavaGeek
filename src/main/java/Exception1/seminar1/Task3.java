package Exception1.seminar1;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”
 */
public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, null, 2, 3, 4, null};
        List <Integer> result = checkArrayNull(arr);
        if(result.size() > 0) {
            System.out.println("Array contains null at index: " + result);
        }else {
            System.out.println("Arrays doesn't contain null");
        }
    }

    private static List<Integer> checkArrayNull(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }return result;
    }
}
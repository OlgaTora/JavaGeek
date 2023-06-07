package Exception1.seminar1;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
1 вариант
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
2 вариант
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим. Какое преимущество у исключений перед
кодами ошибок вы можете назвать в данном случае?

*/

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {0, 0, 0}, {0, 0, 0}};
        int result = sumElementsExc(matrix);
        System.out.println(result);
        result = sumElementsCode(matrix);
        System.out.println(result);
    }

    private static int sumElementsExc(int[][] matrix) {
        for (int[] row : matrix
        ) {
            if (matrix.length != row.length) {
                throw new RuntimeException("Array is not square");
            }
        }
        for (int[] row : matrix
        ) {
            for (int elem : row
            ) {
                if (elem != 0 && elem != 1) {
                    throw new RuntimeException("You've to have only 1 and 0 in array");
                }
            }
        }
        int result = 0;
        for (int[] row : matrix
        ) {
            for (int elem : row
            ) {
                result += elem;

            }
        }
        return result;
    }

    private static int sumElementsCode(int[][] matrix) {
        for (int[] row : matrix
        ) {
            if (matrix.length != row.length) {
                return -1;
            }
        }
        for (int[] row : matrix
        ) {
            for (int elem : row
            ) {
                if (elem != 0 && elem != 1) {
                    return -1;
                }
            }
        }
        int result = 0;
        for (int[] row : matrix
        ) {
            for (int elem : row
            ) {
                result += elem;

            }
        }
        return result;
    }
}
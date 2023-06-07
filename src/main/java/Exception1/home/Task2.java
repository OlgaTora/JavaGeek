package Exception1.home;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static int[] getDiff(int[] array1, int[] array2) throws IllegalArgumentException {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays have different size");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = Math.abs(array1[i] - array2[i]);
        }
        return result;
    }
}

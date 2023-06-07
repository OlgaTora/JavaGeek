package Exception1.seminar1;
    /*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки,
иначе - длину массива.

 */

public class Task0 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int min_length = 5;
        int result = checkArrayLength(arr, min_length);
        System.out.println(result);

    }

    public static int checkArrayLength(int[] arr, int min_length) {
        if (arr.length < min_length) {
            return -1;
        } else {
            return arr.length;
        }
    }
}


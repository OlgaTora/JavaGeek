package Exception1.home;
/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

*/

public class Task0 {
    public static int sumElemArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //division elements in array right -> left
    public static int divArray(int[] arr) {
        int size = arr.length - 1;
        int div = arr[size];
        for (int i = size - 1; i >= 0; i--) {
            div /= arr[i];
            }
        return div;
    }

    public static int convertor(String a) {
        return Integer.parseInt(a);
    }

}


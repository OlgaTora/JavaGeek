package Exception1.seminar1;
    /*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуете взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый метод, обработает возвращенное значение и
покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int min_length = 8;
        int element = 2;
        int result = searchElement(arr, min_length, element);
        System.out.println(result);
        translateResult(result);
    }

    private static int searchElement(int[] arr, int minLength, int element) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -2;
    }

    public static void translateResult(int result) {
        if (result == -1) {
            System.out.println("Длина массива меньше некоторого заданного минимума");
        } else if (result == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("Вместо массива пришел null");
        } else {
            System.out.printf("Индекс искомого элемента %d", result);
        }
    }
}
package Exception1.home;
//* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Task3 {
    public static float[] getQuotient(int[] array1, int[] array2) {
        if(array1.length == 0){
            throw new RuntimeException("Array 1 is null");
        }
        if(array2.length == 0){
            throw new RuntimeException("Array 2 is null");
        }

        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays have different size");
        }

        float[] result = new float[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0){
                throw new RuntimeException("Division by zero");
            }
            result[i] = (float)array1[i] / (float)array2[i];
        }
        return result;
    }
}

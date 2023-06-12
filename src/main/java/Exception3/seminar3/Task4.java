package Exception3.seminar3;

/*
1.Напишите метод,на вход которого подаётся двумерный строковый массив
размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива,преобразовать в
int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в
какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные
исключения MyArraySizeException и MyArrayDataException и вывести
результат расчета (сумму элементов,при условии что подали на вход
корректный массив)
 */
public class Task4 {
    public static void main(String[] args) {
        String[][] twoDemensionalArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            int sum = getSumTwoDemensionalArray(twoDemensionalArray);
            System.out.println("Summa of elements is: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getSumTwoDemensionalArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }else{
            try{
                for (String[] strings : arr) {
                    for (int j = 0; j < arr.length; j++) {
                        sum += Integer.parseInt(strings[j]);
                    }
                }
            }catch (NumberFormatException e) {
                throw new MyArrayDataException();
            }
        }
        return sum;
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("This array is not two-demensional array 4x4");
        }
    }
    public static class MyArrayDataException extends Exception{
        public MyArrayDataException(){
            super("This array not contains only numbers ");
        }
    }
}

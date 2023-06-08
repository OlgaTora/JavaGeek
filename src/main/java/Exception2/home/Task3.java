package Exception2.home;
/*
Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            // exception divison by 0
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Division by zero is not possible");
            }

            printSum(23, 234);

            int[] abc = {1, 2};
            abc[3] = 9;
            // if array is null
            } catch (NullPointerException e) {
              System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Массив выходит за пределы своего размера!");
            // this exception at last
            } catch (Throwable e) {
                System.out.println("Что-то пошло не так...");
        }
    }

    //We don't have file name in this code, remove file exception
    public static void printSum(Integer a, Integer b) {//} throws FileNotFoundException {
        System.out.println(a + b);
    }
}

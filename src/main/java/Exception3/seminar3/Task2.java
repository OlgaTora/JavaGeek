package Exception3.seminar3;
/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try
и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
лучше всего.
 */
public class Task2 {
    public static void main(String[] args) {
        try{
            int number = 10;
            int result;
            Counter counter = new Counter();
            //System.out.println("Counter: " + counter);
            result = Counter.add(number);
            System.out.println("Its OK, result is: " + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static class Counter implements AutoCloseable {
        public static int add(int number){
            number+=1;
            return number;
        }

        @Override
        public void close() throws Exception {
            System.out.println("Close exception");
        }
    }
}

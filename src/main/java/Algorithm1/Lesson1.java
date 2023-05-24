package Algorithm1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Algorithm find summa");
        int summ = findSumNumbers(10);
        summ = findSumNumbers(11);
        System.out.println("___________________");

        System.out.println("Algorithm find divider");
        List<Integer> availableDivider = findAvailableDivider(12);
        availableDivider = findAvailableDivider(13);
        System.out.println("___________________");

        System.out.println("Algorithm find simple numbers");
        List<Integer> simpleNumbers = findSimpleNumber(10);
        simpleNumbers = findSimpleNumber(11);
        System.out.println("___________________");

        System.out.println("Algorithm find summa of cubes");
        int iter = combinationCount(2, 4);
        System.out.println("Number of iter: " + iter);
        iter = combinationCount(3, 5);
        System.out.println("Number of iter: " + iter);
        System.out.println("___________________");

        System.out.println("Algorithm find fibonacci");
        AtomicInteger counter = new AtomicInteger();
        int fib = fibRecursive(5, counter);
        System.out.println("Number of iter recurse: " + counter.get());
        fib = fib(5);
        System.out.println("___________________");

        test();
    }

/* Необходимо написать алгоритм, считающий сумму всех чисел
от 1 до N. Согласно свойствам линейной сложности,
количество итераций цикла будет линейно изменяться
относительно изменения размера N*/

    public static int findSumNumbers(int number) {
        int counter = 0;
        int result = 0;
        for (int i = 1; i < number; i++) {
            result += i;
            counter++;
        }
        System.out.println("Number of iter: " + counter);
        return result;
    }

    // Написать алгоритм поиска делителей чисел в диапазоне от 1 до N
    public static List<Integer> findAvailableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            counter++;
            if (number % i == 0) {
                result.add(i);
            }
        }
        System.out.println("Number of iter: " + counter);
        return result;
    }

    /* Написать алгоритм поиска простых чисел в диапазоне от 1 до N. В алгоритме будет использоваться
    вложенный for, что явно говорит о квадратичной сложности, на этом
    стоит акцентировать внимание
     */
    public static List<Integer> findSimpleNumber(int max) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i < max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                }
                counter++;
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("Number of iter: " + counter);
        return result;
    }

    /* Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
    Считаем, что 1 и 2 значения последовательности равны 1.
    Искать будем по формуле On=On-1+On-2 что предполагает использовать
    рекурсивного алгоритма. */
    public static int fibRecursive(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibRecursive(position - 1, counter) + fibRecursive(position - 2, counter);
    }

    /*
    Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот
    раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
    линейную сложность, т.к. вычисление каждого из чисел последовательности будет
    происходить ровно 1 раз.
     */
    public static int fib(int position) {
        int[] array = new int[position];
        int counter = 0;
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < position; i++) {
            array[i] = array[i - 1] + array[i - 2];
            counter++;
        }
        System.out.println("Number of iter: " + counter);
        return array[position - 1];
    }


    /*Необходимо написать алгоритм поиска всех доступных комбинаций
    (посчитать количество) для количества кубиков K с количеством граней N.
    У вас есть 2 варианта на выбор – количество кубиков может быть строго
    ограничено (4 кубика, например), либо их количество будет
    динамическим.
    Если вы реализуете простой вариант, обращает внимание, что данное
    решение имеет сложность O(n4), но если количество кубиков сделать
    переменной, то она трансформируется в O(nk), что будет представлять
    собой экспоненциальную сложность.*/

    public static int findSumCubes(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for (int k = 1; k <= number; k++) {
                    for (int l = 1; l <= number; l++) {
                        counter++;
                    }
                }
            }
        }
        System.out.println("Number of iter: " + counter);
        return counter;
    }

// случайное количество кубиков

    public static int combinationCount(int cubes, int faces) {
        if (cubes > 0) {
            return recursiveCount(1, cubes, faces);
        } else {
            return 0;
        }
    }

    public static int recursiveCount(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCount(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }

    public static void test() {
        for (int i = 10; i < 50; i = i + 10) {
            Date start = new Date();
            fib(i);
            Date end = new Date();
            long fibDuration = end.getTime() - start.getTime();
            AtomicInteger counter = new AtomicInteger();
            start = new Date();
            fibRecursive(i, counter);
            end = new Date();
            long fibRecursiveDuration = end.getTime() - start.getTime();
            System.out.printf("i: %s, line: %s, recursive: %s%n", i, fibDuration, fibRecursiveDuration);

        }
    }
}


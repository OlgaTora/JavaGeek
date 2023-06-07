package Exception1.home;

/*
Посмотрите на код и подумайте сколько разных типов исключений вы тут сможете получить?
*/

public class Task1 {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (String[] strings : arr) { //если массив null -> NullPointerException
            for (int j = 0; j < 2; j++) { // не посчитает значения из столбцов с индексом больше 1
                int val = Integer.parseInt(strings[j]); //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}


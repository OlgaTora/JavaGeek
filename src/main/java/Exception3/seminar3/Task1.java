package Exception3.seminar3;

import java.io.IOException;

/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвалметод doSomething().
 */
public class Task1 {
    public static void main(String[] args){
     try {
         doSomething();
     }catch (IOException e){
         System.out.println("Catch exception IO");
     }
    }
    public static void doSomething() throws IOException {
        System.out.println("Do something");
    }
}

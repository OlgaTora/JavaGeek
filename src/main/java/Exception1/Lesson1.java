package Exception1;
//План урока:
//        - посмотреть откуда могут браться ошибки
//        - научиться обрабатывать исключительные ситуации с помощью кодов ошибок и исключений
//        - научиться бросать исключения, когда метод не может выполнить корректно свою работу

import java.io.File;

public class Lesson1 {
    public static void main(String[] args) {
    // System.out.println(getFileSize(new File("123")));
    System.out.println(divide(1, 0));}

    public static int divide(int a1, int a2){
        if(a2 == 0){
            throw new RuntimeException("Its not possible divide 0");
            //return -1;
        }
        return a1/a2;
    }
    public static long getFileSize(File file){
        if(!file.exists()){
            return -1L;
        }
        return file.length();
    }
}

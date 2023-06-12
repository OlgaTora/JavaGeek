package Exception3.seminar3;
/*
1. Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение
об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к
пустому элементу в массиве ссылочного типа. Исключение должно
отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователя сообщение об ошибке.

 */
public class Task3 {
    public class ZeroException extends RuntimeException{
        public ZeroException(){
            super("Division by zero is not possible!");
        }
    }
    public class NullArrayElementException extends RuntimeException{
        public NullArrayElementException(){
            super("Element at this index is null");
        }
    }
    public class FileDoesNotExist extends RuntimeException{
        public  FileDoesNotExist(){
            super("This file doesn't exist");
        }
    }
}

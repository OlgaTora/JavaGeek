package Seminar6.home;

import java.util.List;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (ArrayList).
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
ыводить только те ноутбуки, что соответствуют условию

 */
public class Main {
    public static void main(String[] args) {
        ClassNotebook notebook1 = new ClassNotebook("1", "Honor", "red", "8", "5");
        ClassNotebook notebook2 = new ClassNotebook("2", "Honor", "white", "16", "25");
        ClassNotebook notebook3 = new ClassNotebook("3", "Samsung", "red", "8", "15");
        ClassNotebook notebook4 = new ClassNotebook("4", "Asus", "black", "4", "15");
        ClassNotebook notebook5 = new ClassNotebook("5", "Honor", "blue", "16", "5");
        List<ClassNotebook> listNotebooks = List.of(notebook1, notebook2, notebook3, notebook4, notebook5);


        ActivitiesNotebook operation = new ActivitiesNotebook(listNotebooks);
        operation.start();
    }
}


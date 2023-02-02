package Seminar4;
/*
Подается строка вида text~num. Из нее надо text сохранить в связный список
на позицию num. При запросе print~num вывести позицию из num и удалить ее.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        createList();
    }

    private static void createList() {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 21; i++) {
            list.add("x");
        }
        System.out.println("List for check: " + list);

        while (true) {
            System.out.println("Input your information in format 'text~num': ");
            String clientInfo = iScanner.nextLine();

            if (clientInfo.length() == 0) {
                System.out.println("The string is null. Error!");
                continue;

            }
            if (clientInfo.equals("quit")) {
                System.exit(0);
            }

            if (!clientInfo.contains("~")) {
                System.out.println("Error! Input in format text~num");
                continue;
            }
            var index = 0;
            String[] splitClientsInfo = clientInfo.split("\\~");

            try {
                index = Integer.parseInt(splitClientsInfo[1]);
            } catch (NumberFormatException e) {
                System.out.println("Error! Input in format text~NUM");
                continue;
            }

            if (index > 0 && index > list.size() + 1) {
                System.out.println("Error! Your index is out of list!");
                continue;

            }
            String text = splitClientsInfo[0];

            if (text.equals("print")) {
                System.out.println(list.get(index));
                list.remove(index);
            }else if(index == list.size()){
                list.add(index, text);
            }else{
                list.set(index, text);
            }
            System.out.println("List after add/remove: " + list);
        }
    }
}

package Seminar9.homew9;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();

        for (int i = 1; i < 9; i++) {
            linkList.addElement(i);
        }
        System.out.print("Your new linked list is: ");
        linkList.printList();

        System.out.println("\n~~~~~~~~~~~~~~~~");
        linkList.addElement(4, 9);
        System.out.print("Your list with new element is: ");
        linkList.printList();

        System.out.println("\n~~~~~~~~~~~~~~~~");
        linkList.addLastElement(10);
        System.out.print("Your list with new last element is: ");
        linkList.printList();

        System.out.println("\n~~~~~~~~~~~~~~~~");
        linkList.addFirstElement(11);
        System.out.print("Your list with new first element is: ");
        linkList.printList();

        System.out.println("\n~~~~~~~~~~~~~~~~");
        linkList.addElement(13, 11);


    }
}

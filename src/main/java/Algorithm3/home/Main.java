package Algorithm3.home;

// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.addNode(5);
        list.addNode(2);
        list.addNode(7);
        list.addNode(11);
        list.addNode(18);

        System.out.print("To check linked list: ");
        list.printList(LinkList.head);
        System.out.println();
        list.reverse();
        System.out.print("The reversed linked List: ");
        list.printList(LinkList.head);
    }
}

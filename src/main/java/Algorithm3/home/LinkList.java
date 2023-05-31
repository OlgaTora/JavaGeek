package Algorithm3.home;

public class LinkList {
    static Node head;
    static class Node {
        int element;
        Node nextElement;
        Node previousElement;

        Node(int data) {
            element = data;
            nextElement = null;
            previousElement = null;
        }
    }
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.nextElement;
        }
    }
    public void addNode(int new_data) {
        Node new_node = new Node(new_data);
        new_node.previousElement = null;
        new_node.nextElement = head;

        if (head != null) {
            head.previousElement = new_node;
        }
        head = new_node;
    }

    public void reverse() {
        Node tmp = null;
        Node current = head;

		while (current != null) {
            tmp = current.previousElement;
            current.previousElement = current.nextElement;
            current.nextElement = tmp;
            current = current.previousElement;
        }
        if (tmp != null) {
            head = tmp.previousElement;
        }
    }
}
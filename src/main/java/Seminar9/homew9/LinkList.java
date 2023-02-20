package Seminar9.homew9;

import java.util.Iterator;

public class LinkList<E> implements Iterable<E> {
    private int size = 0;
    private Node<E> firstNode;
    private Node<E> lastNode;

    private Node<E> current = null;

    public Node<E> getFirstNode() {
        return firstNode;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(this));
    }

    public void printList() {
        for (E element : this
        ) {
            System.out.print(element + " ");
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = getFirstNode();

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.nextElement;
                return element;
            }
        };
    }

    public void addElement(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("You've input index out of bounds");
        } else {
            Node<E> node = new Node<>(element);
            if (size == 0) {
                firstNode = node;
                lastNode = node;
            } else {
                if (index == 0) {
                    node.setNextElement(firstNode);
                    firstNode.setPreviousElement(node);
                    firstNode = node;
                } else if (index == size) {
                    node.setPreviousElement(lastNode);
                    lastNode.setNextElement(node);
                    lastNode = node;
                } else {
                    node.setNextElement(getNode(index));
                    node.setPreviousElement(node.nextElement.previousElement);
                    node.previousElement.setNextElement(node);
                    node.nextElement.setPreviousElement(node);
                }
            }
            size++;
        }
    }

    public void addElement(E element) {
        addElement(size, element);
    }

    public void addFirstElement(E element) {
        addElement(0, element);
    }

    public void addLastElement(E element) {
        addElement(size, element);
    }

    private Node<E> getNode(int index) {
        if (index < (size >> 1)) {
            current = firstNode;
            for (int i = 1; i <= index; i++) {
                current = current.nextElement;
            }
        } else {
            current = lastNode;
            for (int i = size - 1; i > index; i--) {
                current = current.previousElement;
            }
        }
        return current;
    }

    private class Node<E> {
        private final E element;
        private Node<E> nextElement;
        private Node<E> previousElement;

        public Node(E element) {
            this.element = element;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public void setPreviousElement(Node<E> previousElement) {
            this.previousElement = previousElement;
        }
    }
}


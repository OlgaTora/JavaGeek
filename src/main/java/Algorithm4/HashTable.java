package Algorithm4;

import java.util.LinkedList;

//Создаем класс хэш-таблицы, а также вложенный класс Entity,
// описывающий пары ключ-значение и связный список для хранения этих пар
public class HashTable<K, V> {
    //Добавляем массив связных списков с фиксированным размером (массив бакетов)
    private static final int INIT_BASKET_COUNT = 16;
    private Basket[] baskets;


    // Добавляем информацию о размере хэш-таблицы, а также алгоритм увеличения
    // количества бакетов при достижении количества элементов до определенного размера
    // относительно количества бакетов (load factor)
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;

    private void recalculate() {
        Basket[] old = baskets;
        baskets = (Basket[]) new Object[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Basket basket = old[i];
            Basket.Node node = basket.head;
            while (node != null) {
                put(node.data.key, node.data.value);
                node = node.nextNode;
            }
            old[i] = null;
        }
    }

    public HashTable() {
        this(INIT_BASKET_COUNT);
    }

    // конструктор
    public HashTable(int initSize) {
        baskets = (Basket[]) new Object[initSize];
    }

    //метод вычисления индекса на основании хэш-кода ключа
    public int caclBasketIndex(K key) {
        return key.hashCode() % baskets.length;
    }

    //метод поиска данных по ключу в хэш-таблице
    public V getValue(K key) {
        int index = caclBasketIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.getValue(key);
        }
        return null;
    }

    //алгоритм добавления и удаления элементов из хэш-таблицы по ключу
    public boolean put(K key, V value) {
        if (baskets.length * LOAD_FACTOR < size) {
            recalculate();
        }
        int index = caclBasketIndex(key);
        Basket basket = baskets[index];
        if (basket == null) {
            basket = new Basket();
            baskets[index] = basket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        boolean add = basket.add(entity);
        if (add) {
            size++;
        }
        return add;
    }

    public boolean remove(K key) {
        int index = caclBasketIndex(key);
        Basket basket = baskets[index];
        boolean remove = basket.remove(key);
        if (remove) {
            size--;
        }
        return remove;
    }

    private class Entity {
        private K key;
        private V value;
    }

    private class Basket {
        private Node head;

        public V getValue(K key) {
            Node node = head;
            while (node != null) {
                if (node.data.key.equals(key)) {
                    return node.data.value;
                }
                node = node.nextNode;
            }
            return null;
        }

        //методы добавления элементов в связный список,
        //если там еще нет пары с аналогичным ключом и удаления элемента с аналогичным ключом из списка

        public boolean remove(K key) {
            if (head != null) {
                if (head.data.key.equals(key)) {
                    head = head.nextNode;
                } else {
                    Node node = head;
                    while (node.nextNode != null) {
                        if (node.nextNode.data.key.equals(key)) {
                            node.nextNode = node.nextNode.nextNode;
                            return true;
                        }
                        node = node.nextNode;
                    }
                }
            }
            return false;
        }

        public boolean add(Entity entity) {
            Node node = new Node();
            node.data = entity;
            if (head != null) {
                Node currentNode = head;
                while (true) {
                    if (currentNode.data.key.equals(entity.key)) {
                        return false;
                    }
                    if (currentNode.nextNode == null) {
                        currentNode.nextNode = node;
                        return true;
                    } else {
                        currentNode = currentNode.nextNode;
                    }
                }
            } else {
                head = node;
                return true;
            }
        }

        private class Node {
            private Entity data;
            private Node nextNode;
        }
    }
}

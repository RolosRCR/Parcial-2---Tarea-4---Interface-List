package com.company.list;

import static com.company.list.Position.AFTER;
import static com.company.list.Position.BEFORE;

public class LinkedList<T> implements List<T> {
    private static class Node<T> {
        private final T data;
        private Node<T> previous;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void add(T data) {
        Node<T> node = new Node<>(data);

        node.previous = tail;

        if (tail != null) {
            tail.next = node;
        }

        if (head == null) {
            head = node;
        }

        tail = node;
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        Node<T> currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentNode.data;
    }

    @Override
    public void delete(int index) {
        Node<T> currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        size--;

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.previous = null;
        }

        if (index == size) {
            tail = tail.previous;
            tail.next = null;
        }

        if (index > 0 && index < size) {
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }
    }

    @Override
    public void insert(T data, Position position, com.company.list.Iterator<T> it) {
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = ((Iterator) it).getCurrentNode();

        if (position == AFTER) {
            newNode.next = currentNode.next;
            newNode.previous = currentNode;
            currentNode.next = newNode;
            if (newNode.next != null) {
                newNode.next.previous = newNode;
            } else {
                tail = newNode;
            }
        } else if (position == BEFORE) {
            newNode.previous = currentNode.previous;
            newNode.next = currentNode;
            currentNode.previous = newNode;
            if (newNode.previous != null) {
                newNode.previous.next = newNode;
            } else {
                head = newNode;
            }
        } else {
            System.out.println("Posicion no encontrada");
        }
        size++;
    }

    @Override
    public com.company.list.Iterator<T> getIterator() {
        return new Iterator();
    }

    @Override
    public ReverseIterator getReverseIterator() {
        return new ReverseIterator();
    }

    public class Iterator implements com.company.list.Iterator<T> {
        private Node<T> currentNode;

        public Iterator() {
            this.currentNode = head;
        }

        public Iterator(Iterator iterator) {
            currentNode = iterator.currentNode;
        }

        public boolean hasNext() {
            return currentNode != null;
        }

        public T next() {
            T data = currentNode.data;

            currentNode = currentNode.next;

            return data;
        }

        Node<T> getCurrentNode() {
            return currentNode;
        }
    }

    public class ReverseIterator implements com.company.list.Iterator<T> {

        private Node<T> currentNode;

        public ReverseIterator() {
            this.currentNode = tail;
        }


        public boolean hasNext() {
            return currentNode != null;
        }

        public T next() {
            T data = currentNode.data;

            currentNode = currentNode.previous;

            return data;
        }
    }

}
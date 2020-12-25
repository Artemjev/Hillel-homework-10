package com.hillel.artemjev.list.doublylinkedList;

import java.util.Iterator;


public class DoublyLinkedList_v1<T> implements DoublyLinkedList<T> {
    Node head;
    Node tail;
    private int size = 0;


    private static class Node {
        Object value;
        Node next;
        Node prev;

        public Node(Object value) {
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        checkIndex(index);
        Node cur = getNodeByIndex(index);
        return (T) cur.value;
    }

    public void set(int index, T value) {
        checkIndex(index);
        Node cur = getNodeByIndex(index);
        cur.value = value;
    }

    public void add(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        ++size;
    }

    @Override
    public Iterator<T> iterator() {
//        return new DoublyLinkedListIterator();
        return new DoublyLinkedListReverseIterator();
    }

    private class DoublyLinkedListIterator implements Iterator<T> {
        Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            T value = (T) cur.value;
            cur = cur.next;
            return value;
        }
    }

    private class DoublyLinkedListReverseIterator implements Iterator<T> {
        Node cur = tail;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            T value = (T) cur.value;
            cur = cur.prev;
            return value;
        }
    }

    //-----------------------------------------------------------------------
    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    private Node getNodeByIndex(int index) {
        Node cur;
        if (index <= size / 2) {
            cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
//                System.out.println("получаеем " + index + "й -> " + i + "->");
            }
        } else {
            cur = tail;
            for (int i = size - 1; i > index; i--) {
                cur = cur.prev;
//                System.out.println("получаеем " + index + "й -> " + i + "->");
            }
        }
        return cur;
    }

}


package com.hillel.artemjev.list.doublylinkedList;

public interface DoublyLinkedList<T> extends Iterable<T> {

    int size();

    T get(int index);

    void set(int index, T value);

    void add(T value);

}

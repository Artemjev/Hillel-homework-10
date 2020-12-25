package com.hillel.artemjev.list;

import com.hillel.artemjev.list.doublylinkedList.DoublyLinkedList;
import com.hillel.artemjev.list.doublylinkedList.DoublyLinkedList_v1;
import com.hillel.artemjev.list.doublylinkedList.DoublyLinkedList_v2;
import com.hillel.artemjev.list.doublylinkedList.DoublyLinkedList_v3;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> listInt =
//                new DoublyLinkedList_v1<Integer>();
//                new DoublyLinkedList_v2<Integer>();
                new DoublyLinkedList_v3<Integer>();
        listInt.add(0);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);

        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }

        System.out.println("\n-----------------------------------------------\n");

        listInt.forEach(elem -> System.out.println(elem));

    }
}

package org.example;

import my.data.structures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(5);
        linkedList.insert(3);

        if (linkedList.size() == 2) { System.out.println("YES"); }
        linkedList.print();

        linkedList.pop();
        linkedList.print();
        linkedList.insertAt(1, 10);
        linkedList.insertAt(2, 7);
        linkedList.insertAt(3, 12);
        linkedList.print();

        linkedList.reverse();
        linkedList.print();
    }
}
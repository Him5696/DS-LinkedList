package com.bridgelabz.linkedlist;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Welcome to linkedList Program");
        LinkedList<Integer> list = new LinkedList<>();
        list.push(56);
        list.push(30);
        list.push(70);
        list.print();
        System.out.println();

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(56);
        linkedList.addLast(70);
        linkedList.insertInBetween(56, 70, 30);
        linkedList.print();
        System.out.println("\nFinding Element Present or not");
        linkedList.findNode(30);
        System.out.println("Element Added after node 30 in the list");
        linkedList.appendingNode(30, 40);
        linkedList.print();
        System.out.println("\nElement 40 deleted from list");
        linkedList.deleteAnyNode(40);
        linkedList.print();
        System.out.println("\nsize of linkedList is: " + linkedList.size());
    }
}

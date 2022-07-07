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
        linkedList.appendingNode(56, 30);
        linkedList.appendingNode(30, 70);
        linkedList.print();
    }
}

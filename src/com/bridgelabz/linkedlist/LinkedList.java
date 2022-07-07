package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newnode = new Node<>(data);
        if (newnode == null) {
            newnode = tail;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node newNode = head;
        while (newNode != null) {
            System.out.print(" -> " + newNode.data);
            newNode = newNode.next;
        }
    }
}

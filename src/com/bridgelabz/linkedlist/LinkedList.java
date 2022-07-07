package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (newNode == null) {
            newNode = tail;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            Node currNode = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }
    public void appendingNode(T before, T data) {
        Node newNode = head;
        while (newNode.data != before) {
            newNode =  newNode.next;
        }
        Node node = new Node(data);
        node.next =  newNode.next;
        newNode.next = node;

    }
    public void insertInBetween(T before, T after, T data) {
        Node currentNode = head;
        while (currentNode.data != before && currentNode.data != after) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
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
    //delete first
    public void popFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
}

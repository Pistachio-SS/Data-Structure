package com.example.List;

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data =data;
        this.next=null;
    }
}
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(){
        this.head =null;
    }

    public void insertAtBeginning(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtEnd(T data){
        Node<T> newNode = new Node<>(data);

        if (head==null){
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void delete(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printList() {
        Node<T> current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }




}

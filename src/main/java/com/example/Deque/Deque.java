package com.example.Deque;

import java.util.LinkedList;
public class Deque<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void addFirst(T item){
        list.addFirst(item);
    }

    public void addLast(T item){
        list.addLast(item);
    }

    public T removeFirst(){
        if(list.isEmpty()){
            throw new IllegalStateException("Deque is empty");
        }
        else{
            return list.removeFirst();
        }
    }

    public T removeLast(){
        if (list.isEmpty()){
            throw  new IllegalStateException("Deque is empty");
        }else{
            return list.removeLast();
        }
    }

    // Returns the element at the front of the deque without removing it
    public T peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return list.getFirst();
    }

    // Returns the element at the end of the deque without removing it
    public T peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return list.getLast();
    }

    // Returns the number of elements in the deque
    public int size() {
        return list.size();
    }

    // Returns true if the deque is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Clears all elements in the deque
    public void clear() {
        list.clear();
    }

    // Print the elements of the deque
    public void printDeque() {
        System.out.println("Deque: " + list);
    }
}



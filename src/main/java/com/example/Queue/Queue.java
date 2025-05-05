package com.example.Queue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Adds an item to the end of the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Removes and returns the item at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Returns the item at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    // Returns the number of elements in the queue
    public int size() {
        return list.size();
    }

    // Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Clears all elements in the queue
    public void clear() {
        list.clear();
    }

    // Print the elements of the queue
    public void printQueue() {
        System.out.println("Queue: " + list);
    }
}

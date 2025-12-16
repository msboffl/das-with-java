package com.dsa.queue;

public class MyQueue {
    private int[] arr;
    private int capacity;
    private int size;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public void enQueue(int value) {
        if(size == capacity) {
            System.out.println("Queue is full");
        }

        arr[size++] = value;
    }

    public void deQueue() {
        if(size == 0) {
            System.out.println("Queue is empty");
        }

        for(int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;

    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        queue.deQueue();

        queue.print();

    }

}

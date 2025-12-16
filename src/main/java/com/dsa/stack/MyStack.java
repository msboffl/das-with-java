package com.dsa.stack;

public class MyStack {
    private final int[] arr;
    private final int capacity;
    private int top = -1;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        int top = -1;
    }

    public void push(int value) {
        if(top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }

        ++top;
        arr[top] = value;

    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }

        arr[top] = 0;
        top--;
    }

    public void print() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();

        stack.print();
    }

}

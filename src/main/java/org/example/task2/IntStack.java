package org.example.task2;

public class IntStack {

    private int[] data;   
    private int size;      

    private static final int DEFAULT_CAPACITY = 10;

    public IntStack() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(int value) {
        ensureCapacity();
        this.data[this.size] = value;
        this.size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        this.size--;
        return this.data[this.size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return this.data[this.size - 1];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.size = 0;
    }

    private void ensureCapacity() {
        if (this.size == this.data.length) {
            int[] newArray = new int[this.data.length * 2];
            System.arraycopy(this.data, 0, newArray, 0, this.data.length);
            this.data = newArray;
        }
    }
}

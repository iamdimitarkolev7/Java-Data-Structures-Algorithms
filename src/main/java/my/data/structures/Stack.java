package my.data.structures;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> list;
    private int topIndex;
    private int capacity;

    Stack(int size) {
        list = new ArrayList<>(size);
        capacity = size;
        topIndex = -1;
    }

    public void push(int data) {
        if (this.topIndex + 1 > capacity) {
            throw new ArrayIndexOutOfBoundsException("Out of stack capacity");
        }

        this.list.add(data);
        this.topIndex += 1;
    }

    public void pop() {
        if (this.topIndex == -1) {
            throw new ArrayIndexOutOfBoundsException("Cannot remove an element from an empty stack");
        }

        this.list.remove(this.topIndex);
        this.topIndex--;
    }

    public int peek() {
        return this.list.get(this.topIndex);
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return this.topIndex + 1 == this.capacity;
    }

    public int size() {
        return this.topIndex + 1;
    }
}

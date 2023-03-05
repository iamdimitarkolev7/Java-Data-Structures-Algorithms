package my.data.structures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private ArrayList<T> list;
    private final int capacity;
    private int rear;
    private int front;

    Queue(int size) {
        list = new ArrayList<>();
        capacity = size;
        front = 0;
        rear = 0;
    }

    public void add(T data) {
        if (this.capacity < this.list.size() + 1) {
            throw new IllegalStateException("Queue capacity is full");
        }

        this.list.add(data);
        this.rear += 1;
    }

    public T peek() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Cannot get an element from an empty queue");
        }

        return this.list.get(this.front);
    }

    public T remove() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Cannot get an element from an empty queue");
        }

        this.rear--;

        return this.list.remove(this.front);
    }

    public T poll() {
        if (this.list.isEmpty()) {
            return null;
        }

        this.rear--;

        return this.list.remove(this.front);
    }

    public int size() {
        return this.list.size();
    }
}

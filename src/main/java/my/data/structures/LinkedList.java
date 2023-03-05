package my.data.structures;

public class LinkedList<T> {
    private Node head;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    /*
    * Inserts an element in the end of the linked list
    * */
    public void insert(T data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            head = newNode;
        }
        else {
            Node last = this.head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
    }

    /*
    * Returns the size of the linked list
    * */
    public int size() {
        Node current = this.head;
        int counter = 0;

        while (current != null) {
            counter += 1;
            current = current.next;
        }

        return counter;
    }

    /*
    * Removes the last element from the linked list
    * */
    public void pop() {
        Node current = this.head;

        if (current == null) {
            return;
        }

        if (current.next == null) {
            this.head = null;
            return;
        }

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    /*
    * Inserts a new node in a particular index
    * */
    public void insertAt(int index, T data) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Index is out of range!");
        }

        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
            return;
        }

        Node current = this.head;
        Node next = this.head.next;

        index--;
        while (index > 0) {
            current = current.next;
            next = current.next;
            index--;
        }

        Node newNode = new Node(data);

        current.next = newNode;
        newNode.next = next;
    }

    /*
    * Removes a node in a particular index
    * */
    public void removeAt(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index is out of range!");
        }

        if (index == 0) {
            this.head = this.head.next;
            return;
        }

        Node current = this.head;

        index--;
        while (current != null && index > 0) {
            current = current.next;
            index--;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    /*
    * A method reversing our linked list
    * */
    public void reverse() {
        if (this.size() == 0 || this.size() == 1) {
            return;
        }

        Node current = this.head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        this.head = previous;
    }

    /*
    * Returns the data at the particular index
    * */
    public T at(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index is out of range!");
        }

        Node current = this.head;

        while (index > 0 && current.next != null) {
            current = current.next;
            index--;
        }

        return current.data;
    }

    public void print() {
        Node current = this.head;

        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println(current.data);
    }
}

package my.data.structures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("Insert method test")
    void insert() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        assertEquals(1, linkedList.at(0));
        assertEquals(2, linkedList.at(1));
        assertEquals(3, linkedList.at(2));
    }

    @Test
    @DisplayName("Size method test")
    void size() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        assertEquals(3, linkedList.size());
    }

    @Test
    @DisplayName("Pop method test")
    void pop() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.pop();
        assertEquals(2, linkedList.size());
        assertEquals(1, linkedList.at(0));
        assertEquals(2, linkedList.at(1));

        linkedList.pop();
        assertEquals(1, linkedList.size());
        assertEquals(1, linkedList.at(0));

        linkedList.pop();
        assertEquals(0, linkedList.size());
    }

    @Test
    @DisplayName("InsertAt method test")
    void insertAt() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        assertEquals(1, linkedList.at(0));
        assertEquals(3, linkedList.size());

        linkedList.insertAt(0, 5);

        assertEquals(5, linkedList.at(0));
        assertEquals(1, linkedList.at(1));
        assertEquals(4, linkedList.size());

        linkedList.insertAt(2, 7);
        assertEquals(7, linkedList.at(2));
        assertEquals(5, linkedList.size());
    }

    @Test
    @DisplayName("RemoveAt method test")
    void removeAt() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        linkedList.removeAt(2);

        assertEquals(2, linkedList.size());
        assertEquals(2, linkedList.at(1));
        assertEquals(1, linkedList.at(0));

        linkedList.removeAt(0);

        assertEquals(1, linkedList.size());
        assertEquals(2, linkedList.at(0));

        linkedList.removeAt(0);
        assertEquals(0, linkedList.size());
    }

    @Test
    @DisplayName("Reverse method test")
    void reverse() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        assertEquals(1, linkedList.at(0));
        assertEquals(2, linkedList.at(1));
        assertEquals(3, linkedList.at(2));
        assertEquals(4, linkedList.at(3));

        linkedList.reverse();

        assertEquals(4, linkedList.at(0));
        assertEquals(3, linkedList.at(1));
        assertEquals(2, linkedList.at(2));
        assertEquals(1, linkedList.at(3));
    }
}
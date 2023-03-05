package my.data.structures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    @DisplayName("Add method test")
    void add() {
        Queue<Integer> queue = new Queue<>(3);

        assertEquals(0, queue.size());

        queue.add(4);
        assertEquals(1, queue.size());

        queue.add(5);
        assertEquals(2, queue.size());

        queue.add(6);
        assertEquals(3, queue.size());
    }

    @Test
    @DisplayName("Peek method test")
    void peek() {
        Queue<Integer> queue = new Queue<>(3);

        queue.add(1);
        assertEquals(1, queue.peek());

        queue.add(5);
        queue.remove();
        assertEquals(5, queue.peek());
    }

    @Test
    @DisplayName("Remove method test")
    void remove() {
        Queue<Integer> queue = new Queue<>(3);

        NoSuchElementException thrown = assertThrows(
                NoSuchElementException.class,
                queue::remove);

        assertTrue(thrown.getMessage().contentEquals("Cannot get an element from an empty queue"));

        queue.add(5);
        Integer removedElement = queue.remove();
        assertEquals(5, removedElement);
        assertEquals(0, queue.size());
    }

    @Test
    @DisplayName("Poll method test")
    void poll() {
        Queue<Integer> queue = new Queue<>(3);

        assertNull(queue.poll());

        queue.add(5);
        assertEquals(5, queue.poll());
        assertEquals(0, queue.size());
    }

    @Test
    @DisplayName("Size method test")
    void size() {
        Queue<Integer> queue = new Queue<>(3);

        assertEquals(0, queue.size());

        queue.add(1);
        assertEquals(1, queue.size());

        queue.add(2);
        assertEquals(2, queue.size());

        queue.remove();
        assertEquals(1, queue.size());
    }
}
package my.data.structures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("Push method test")
    void push() {
        Stack stack = new Stack(3);
        stack.push(0);
        stack.push(1);
        stack.push(2);

        assertEquals(3, stack.size());
        assertTrue(stack.isFull());
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.peek());

    }

    @Test
    @DisplayName("Pop method test")
    void pop() {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
        assertEquals(3, stack.size());

        stack.pop();

        assertEquals(2, stack.peek());
        assertEquals(2, stack.size());

        stack.pop();

        assertEquals(1, stack.peek());
        assertEquals(1, stack.size());

        stack.pop();

        assertEquals(0, stack.size());
    }

    @Test
    @DisplayName("Peek method test")
    void peek() {
        Stack stack = new Stack(3);
        stack.push(1);

        assertEquals(1, stack.size());
        assertEquals(1, stack.peek());

        stack.push(2);

        assertEquals(2, stack.size());
        assertEquals(2, stack.peek());

        stack.push(3);

        assertEquals(3, stack.size());
        assertEquals(3, stack.peek());
    }

    @Test
    @DisplayName("IsEmpty method test")
    void isEmpty() {
        Stack stack = new Stack(3);

        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("IsFull method test")
    void isFull() {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertTrue(stack.isFull());
    }

    @Test
    @DisplayName("Size method test")
    void size() {
        Stack stack = new Stack(3);

        assertEquals(0, stack.size());

        stack.push(1);
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(2, stack.size());

        stack.push(3);
        assertEquals(3, stack.size());
    }
}
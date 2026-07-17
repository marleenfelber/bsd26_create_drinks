package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {
    private StringQueue q;

    @BeforeEach
    public void setUp() {
        q = new StringQueue(2);
    }

    @Test
    public void peekReturnsElement() {
        q.offer("Cola");

        assertEquals("Cola", q.peek());
        assertEquals("Cola", q.peek());
    }

    @Test
    public void peekReturnsNull() {
        assertNull(q.peek());
    }

    @Test
    public void offerAddsElement() {
        assertTrue(q.offer("Cola"));
    }

    @Test
    public void offerDeclinesIfFull() {
        StringQueue q = new StringQueue(1);
        q.offer("Cola");
        assertFalse(q.offer("Fanta"));
    }

    @Test
    public void pollReturnsElement() {
        q.offer("Cola");
        assertEquals("Cola", q.poll());
    }

    @Test
    public void pollReturnsNull() {
        StringQueue q = new StringQueue(1);
        assertNull(q.poll());
    }

    @Test
    public void elementZeroElements() {
        StringQueue q = new StringQueue(1);
        assertThrows(NoSuchElementException.class, () -> q.element());
    }

    @Test
    public void elementIfElementExists() {
        q.offer("Cola");
        assertEquals("Cola", q.element());
    }

    @Test
    public void removeZeroElements() {
        StringQueue q = new StringQueue(1);
        assertThrows(NoSuchElementException.class, () -> q.remove());
    }

    @Test
    public void removeIfElementExists() {
        q.offer("Cola");
        assertEquals("Cola", q.remove());
    }
}
package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {
    private DrinkQueue q;

    @BeforeEach
    public void setUp() {
        q = new DrinkQueue(2);
    }

    private Drink makeDrink(String name) {
        return new SimpleDrink(name, new Liquid(name, 0.5, 0));
    }

    @Test
    public void peekReturnsElement() {
        Drink cola = makeDrink("Cola");
        q.offer(cola);

        assertEquals(cola, q.peek());
        assertEquals(cola, q.peek());
    }

    @Test
    public void peekReturnsNull() {
        assertNull(q.peek());
    }

    @Test
    public void offerAddsDrink() {
        assertTrue(q.offer(makeDrink("Cola")));
    }

    @Test
    public void offerDeclinesIfFull() {
        DrinkQueue q = new DrinkQueue(1);
        q.offer(makeDrink("Cola"));
        assertFalse(q.offer(makeDrink("Fanta")));
    }

    @Test
    public void pollReturnsElement() {
        Drink cola = makeDrink("Cola");
        q.offer(cola);
        assertEquals(cola, q.poll());
    }

    @Test
    public void pollReturnsNull() {
        DrinkQueue q = new DrinkQueue(1);
        assertNull(q.poll());
    }

    @Test
    public void elementZeroElements() {
        DrinkQueue q = new DrinkQueue(1);
        assertThrows(java.util.NoSuchElementException.class, () -> q.element());
    }

    @Test
    public void elementIfElementExists() {
        DrinkQueue q = new DrinkQueue(1);
        Drink cola = makeDrink("Cola");
        q.offer(cola);
        assertEquals(cola, q.element());
    }

    @Test
    public void removeZeroElements() {
        DrinkQueue q = new DrinkQueue(1);
        assertThrows(java.util.NoSuchElementException.class, () -> q.remove());
    }

    @Test
    public void removeIfElementExists() {
        DrinkQueue q = new DrinkQueue(1);
        Drink cola = makeDrink("Cola");
        q.offer(cola);
        assertEquals(cola, q.remove());
    }
}
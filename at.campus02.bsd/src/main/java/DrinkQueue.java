import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that represents a queue that stores Drink Objects
 */
public class DrinkQueue {
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    public DrinkQueue(int size) {
        maxSize = size;
    }


    /**
     * returns the first drink without deleting it
     *
     * @return first drink of the queue, null if no drink exist
     */
    public Drink peek()git {
        Drink element;

        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    /**
     * adds a new Drink to the end of the queue
     *
     * @param obj the new drink that should be included in the queue
     * @return true if the drink was successfully added, false if not
     */
    public boolean offer(Drink obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }

        return true;
    }

    /**
     * removes and returns the first drink in the queue
     *
     * @return first drink of the queue, null if queue is empty
     */
    public Drink poll() {
        Drink element = peek();

        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    /**
     * returns the first drink without deleting it (same as peek)
     *
     * @return first drink
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink element() {
        Drink element = peek();

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
        }

        return element;
    }

    /**
     * removes and returns the first drink in the queue (same als poll)
     *
     * @return first drink
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink remove() {
        // Drink element = poll();
        element = "";

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
        }

        return element;
    }
}
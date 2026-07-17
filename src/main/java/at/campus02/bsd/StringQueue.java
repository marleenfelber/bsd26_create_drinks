package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Implementation of the at.campus02.bsd.IQueue Interface that represents a queue that stores String Objects
 */
public class StringQueue implements IQueue {
    private List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    /**
     * Constructor of a at.campus02.bsd.StringQueue witht the maximum size
     *
     * @param size amount of Strings that can be inside of the queue
     */
    public StringQueue(int size) {
        maxSize = size;
    }

    /**
     * adds a new Object to the end of the queue
     *
     * @param obj the new object that should be included in the queue
     * @return true if the element was successfully added, false if not
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
        } else {
            return false;
        }

        return true;
    }

    /**
     * removes and returns the first element in the queue
     *
     * @return first element of the queue, null if queue is empty
     */
    @Override
    public String poll() {
        String element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * removes and returns the first element in the queue (same als poll)
     *
     * @return first element
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
        }

        return element;
    }

    /**
     * returns the first element without deleting it
     *
     * @return first element of the queue, null if no elements exist
     */
    @Override
    public String peek() {
        String element;

        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    /**
     * returns the first element without deleting it (same as peek)
     *
     * @return first element
     * @throws NoSuchElementException if the queue is empty
     */
    @Override // Used or not?
    public String element() {
        String element = peek();

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
        }

        return element;
    }
}
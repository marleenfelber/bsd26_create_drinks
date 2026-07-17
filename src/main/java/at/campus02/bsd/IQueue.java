package at.campus02.bsd;

/**
 * Interface that represents a queue that stores String Objects
 */
public interface IQueue {

    /**
     * adds a new Object to the end of the queue
     *
     * @param obj the new object that should be included in the queue
     * @return true if the element was successfully added, false if not
     */
    public abstract boolean offer(String obj);

    /**
     * removes and returns the first element in the queue
     *
     * @return first element of the queue, null if queue is empty
     */
    public abstract String poll();

    /**
     * removes and returns the first element in the queue (same als poll)
     *
     * @return first element
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract String remove();

    /**
     * returns the first element without deleting it
     *
     * @return first element of the queue, null if no elements exist
     */
    public abstract String peek();

    /**
     * returns the first element without deleting it (same as peek)
     *
     * @return first element
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract String element();
}
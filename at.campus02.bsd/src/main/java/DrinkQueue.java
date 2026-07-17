
public class DrinkQueue {

    public boolean offer(Drink obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }

        return true;
    }

    public Drink poll() {
        Drink element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    public Drink remove() {
        // Drink element = poll();
        element = "";

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
        }

        return element;
    }
}
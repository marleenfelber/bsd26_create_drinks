import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    public DrinkQueue(int size) {
        maxSize = size;
    }

    public Drink peek()git {
        Drink element;

        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

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

        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    public Drink element() {
        Drink element = peek();

        if (element == null) {
            throw new NoSuchElementException("There's no element anymore.");
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
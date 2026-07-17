import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    public DrinkQueue(int size) {
        maxSize = size;
    }

    // offer
    // poll
    // remove

    public Drink peek() {
        Drink element;

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
}
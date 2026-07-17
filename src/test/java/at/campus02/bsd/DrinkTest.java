package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest {

    private Drink makeDrink(String name) {
        return new SimpleDrink(name, new Liquid(name, 0.5, 0));
    }

    @Test
    public void getNameReturnsName() {
        Drink d = makeDrink("Cola");
        assertEquals("Cola", d.getName());
    }

    @Test
    public void setNameChangesName() {
        Drink d = makeDrink("Cola");
        d.setName("Fanta");
        assertEquals("Fanta", d.getName());
    }
}
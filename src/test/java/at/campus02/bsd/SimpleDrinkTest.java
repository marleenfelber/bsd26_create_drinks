package at.campus02.bsd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class represents a simple drink liquid which can be used in
 * drinks
 */
public class SimpleDrinkTest {
    protected Liquid l;

    @DisplayName ("Testing getVolume() method")
    @Test
    void testGetVolume() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        SimpleDrink drink = new SimpleDrink("Mineral Water", liquid);

        assertEquals(0.5, drink.getVolume());
    }

}

package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class represents a simple drink liquid which can be used in
 * drinks
 */
public class SimpleDrinkTest {
    protected Liquid liquidNoAlcohol;
    protected Liquid liquidAlcohol;
    protected SimpleDrink sodaZitron;
    protected SimpleDrink aperolSpritz;


    @BeforeEach
    public void setUp(){
        liquidNoAlcohol = new Liquid("Soda", 0.33, 0.0);
        liquidAlcohol = new Liquid("Aperol", 1, 12.5);
        sodaZitron = new SimpleDrink("Soda-Zitron", liquidNoAlcohol);
        aperolSpritz = new SimpleDrink("Aperol Spritz", liquidAlcohol);
    }

    @DisplayName ("Testing getVolume() method")
    @Test
    void testGetVolume() {
        assertEquals(0.33, sodaZitron.getVolume());
    }

    @DisplayName("Testing getAlcoholPercent() method")
    @Test
    void testGetAlcoholPercent() {
        assertEquals(12.5, aperolSpritz.getAlcoholPercent());
    }

    @DisplayName("Testing isAlcoholic() with an alcoholic drink")
    @Test
    void testIsAlcoholic1() {
        assertEquals(true, aperolSpritz.isAlcoholic());
    }

    @DisplayName("Testing isAlcoholic() with a non-alcoholic drink")
    @Test
    void testIsAlcoholic2() {
        assertEquals(false, sodaZitron.isAlcoholic());
    }

}

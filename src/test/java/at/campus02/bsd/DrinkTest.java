package at.campus02.bsd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinkTest {

    class sampleDrink extends Drink {

        public sampleDrink(String name) {
            super(name);
        }

        @Override
        public double getVolume() {
            return 0.5;
        }

        @Override
        public double getAlcoholPercent() {
            return 12.0;
        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }

    @Test
    void testGetName() {
        Drink drink = new sampleDrink("Wine");
        assertEquals("Wine", drink.getName());
    }

    @Test
    void testSetName() {
        Drink drink = new sampleDrink("Beer");

        drink.setName("Wine");

        assertEquals("Wine", drink.getName());
    }

}

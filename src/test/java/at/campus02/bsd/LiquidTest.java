package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    @Test
    public void getNameReturnsName() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        assertEquals("Rum", l.getName());
    }

    @Test
    public void setNameChangesName() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        l.setName("Cola");
        assertEquals("Cola", l.getName());
    }

    @Test
    public void getVolumeReturnsVolume() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        assertEquals(0.5, l.getVolume(), 0.0001);
    }

    @Test
    public void setVolumeChangesVolume() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        l.setVolume(0.75);
        assertEquals(0.75, l.getVolume(), 0.0001);
    }

    @Test
    public void getAlcoholPercentReturnsPercent() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        assertEquals(40, l.getAlcoholPercent(), 0.0001);
    }

    @Test
    public void setAlcoholPercentChangesPercent() {
        Liquid l = new Liquid("Rum", 0.5, 40);
        l.setAlcoholPercent(20);
        assertEquals(20, l.getAlcoholPercent(), 0.0001);
    }
}
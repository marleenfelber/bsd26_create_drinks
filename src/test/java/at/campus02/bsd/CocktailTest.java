package at.campus02.bsd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CocktailTest {

    @Test
    public void Cocktail(){
        List<Liquid> liquids = new ArrayList<>();
        Cocktail cocktail = new Cocktail("Caipirinha", liquids);

        assertNotNull(cocktail);
    }
}
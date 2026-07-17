package at.campus02.bsd;

import java.util.List;

/**
 * Class that inherits from the at.campus02.bsd.Drink Class and creates a new at.campus02.bsd.Cocktail
 */
public class Cocktail {
    private String name;
    private List<Liquid> liquids;

    /**
     * Constructor to create a new at.campus02.bsd.Cocktail
     *
     * @param name      name of the new at.campus02.bsd.Cocktail
     * @param liquids   list of liquids used in the new at.campus02.bsd.Cocktail
     */
    public Cocktail(String name, List<Liquid> liquids){
        this.name = name;
        this.liquids = liquids;
    }
}
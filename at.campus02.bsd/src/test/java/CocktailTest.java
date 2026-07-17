/**
 * Class that inherits from the Drink Class and creates a new Cocktail
 */
public class Cocktail implements Drink {
    private String name;
    private List<Liquid> liquids;

    /**
     * Constructor to create a new Cocktail
     *
     * @param name      name of the new Cocktail
     * @param liquids   list of liquids used in the new Cocktail
     */
    public Cocktail(String name, List<Liquid> liquids){
        this.name = name;
        this.liquids = liquids;
    }
}
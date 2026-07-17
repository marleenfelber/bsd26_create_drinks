

public class Cocktail implements Drink {
    private String name;
    private List<Liquid> liquids;

    public Cocktail(String name, List<Liquid> liquids){
        this.name = name;
        this.liquids = liquids;
    }

}
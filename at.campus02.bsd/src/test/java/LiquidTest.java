/**
 * Class that creates a new Liquid with a name,
 * the volume in litres and the alcohol percentage
 */
public class Liquid {
    private String name;
    private double volume;
    private double alcoholPercent;

    /**
     * Constructor to create a new liquid
     *
     * @param name name of the new liquid
     * @param volume amount of the new liquid
     * @param alcoholPercent how much alcohol percentage the new liquid has
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
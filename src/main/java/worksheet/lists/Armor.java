package worksheet.lists;

/**
 * Created by jeff on 12/19/16.
 */
public class Armor {
    private String name;
    private String material;
    private int hitPoints;

    public Armor(String name, String material, int hitPoints) {
        this.name = name;
        this.material = material;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}

package work.nightwind.playthings;

/**
 * Created by kowalski on 3/1/2018.
 */

public class Shoe {
    private final String imageName;
    public final String name;
    public final String description;
    public final Double rating;

    public Shoe(String name, String description, String imageName, Double rating) {
        this.imageName = imageName;
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public String getThumbUrl() {
        return "https://shoes.dillonchristensen.com/images/thumbs/" + this.imageName;
    }

    public String getFullImageUrl() {
        return "https://shoes.dillonchristensen.com/images/" + this.imageName;
    }
}

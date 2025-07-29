public class Flowers {
    String name;
    String color;
    String season;
    boolean fragrance;
    String species;
    int petals;

    public void getFlowerInfo() {
        System.out.println("\nFlower Details:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Season: " + season);
        System.out.println("Fragrance: " + (fragrance ? "Yes" : "No"));
        System.out.println("Species: " + species);
        System.out.println("Petals: " + petals);
    }
}class Flowers {
    String name;
    String color;
    String season;
    boolean fragrance;
    String species;
    int petals;

    Flowers(){
        System.out.println("Flowers constructor is invoked");
    }

    Flowers(String name, String color, String season, boolean fragrance, String species, int petals){
        System.out.println("Flowers parameterized constructor is invoked");
        this.name = name;
        this.color = color;
        this.season = season;
        this.fragrance = fragrance;
        this.species = species;
        this.petals = petals;
    }

    public void getFlowerInfo() {
        System.out.println("\nFlower Details:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Season: " + season);
        System.out.println("Fragrance: " + (fragrance ? "Yes" : "No"));
        System.out.println("Species: " + species);
        System.out.println("Petals: " + petals);
    }
}

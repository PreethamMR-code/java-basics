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
}
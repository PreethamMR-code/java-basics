public class Fish {
    String species;
    String habitat;
    double size; 
    String color;

    public void getFishInfo() {
        System.out.println("\nFish Details:");
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}
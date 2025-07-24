public class Marble {
    String color;
    int size;
    int weight;
    String material;
    String pattern;

    public void getMarbleInfo() {
        System.out.println("\nMarble Details:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size + " mm");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Material: " + material);
        System.out.println("Pattern: " + pattern);
    }
}
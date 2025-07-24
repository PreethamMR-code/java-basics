public class Pipe {
    String material;
    double diameter;
    double length;
    String usage;
    String color;

    public void getPipeInfo() {
        System.out.println("\nPipe Details:");
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("Length: " + length + " feet");
        System.out.println("Usage: " + usage);
        System.out.println("Color: " + color);
    }
}
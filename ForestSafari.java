public class ForestSafari {
    String name;
    String location;
    String duration; 
    String type;     
    double price;

    public void getSafariInfo() {
        System.out.println("\nForest Safari Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }
}
public class Weapon {
    String type;
    String name;
    String material;
    double weight;
    String range;
    String origin;

    public void getWeaponInfo() {
        System.out.println("\nWeapon Details:");
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Range: " + range);
        System.out.println("Origin: " + origin);
    }
}
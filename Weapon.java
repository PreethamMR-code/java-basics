class Weapon {
    String type;
    String name;
    String material;
    double weight;
    String range;
    String origin;

    Weapon(){
        System.out.println("Weapon constructor is invoked");
    }

    Weapon(String name, String type, double weight, String material, String range, String origin){
        System.out.println("Weapon parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.material = material;
        this.range = range;
        this.origin = origin;
    }

    public void getWeaponInfo() {
        System.out.println("\nWeapon Details:");
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight );
        System.out.println("Range: " + range);
        System.out.println("Origin: " + origin);
    }
}
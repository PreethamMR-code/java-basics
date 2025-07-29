class GymEquipments {
    String equipmentName;
    String brand;
    double price;
    String type;
    String material;
    double weight;
    String color;

    GymEquipments(){
        System.out.println("GymEquipments constructor is invoked");
    }

    GymEquipments(String equipmentName, String brand, double price, String type, String material, double weight, String color){
        System.out.println("GymEquipments parameterized constructor is invoked");
        this.equipmentName = equipmentName;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.color = color;
    }

    public void getGymEquipmentsInfo() {
        System.out.println("\nGym Equipment Details:");
        System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Color: " + color);
    }
}
class Bottle {
    String material;
    double capacityLiters;
    String color;
    String capType;
    boolean isInsulated;

    Bottle() {
        System.out.println("Bottle constructor invoked");
    }

    Bottle(String material, double capacityLiters, String color) {
        System.out.println("Bottle parameterized constructor (material, capacity, color) invoked");
        this.material = material;
        this.capacityLiters = capacityLiters;
        this.color = color;
    }

    Bottle(String capType, boolean isInsulated, String material) {
        System.out.println("Bottle parameterized constructor (capType, insulated, material) invoked");
        this.capType = capType;
        this.isInsulated = isInsulated;
        this.material = material;
    }

    Bottle(String color, String capType, double capacityLiters) {
        System.out.println("Bottle parameterized constructor (color, capType, capacity) invoked");
        this.color = color;
        this.capType = capType;
        this.capacityLiters = capacityLiters;
    }

    public void getInfo() {
        System.out.println("\n--- Bottle Details ---");
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacityLiters + " Liters");
        System.out.println("Color: " + color);
        System.out.println("Cap Type: " + capType);
        System.out.println("Is Insulated: " + isInsulated);
    }
}


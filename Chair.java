class Chair {
    String material;
    String color;
    int legs;
    boolean hasWheels;
    String comfortLevel;

    Chair() {
        System.out.println("Chair constructor invoked");
    }

    Chair(String material, String color, int legs) {
        System.out.println("Chair parameterized constructor (material, color, legs) invoked");
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    Chair(boolean hasWheels, String comfortLevel, String material) {
        System.out.println("Chair parameterized constructor (hasWheels, comfortLevel, material) invoked");
        this.hasWheels = hasWheels;
        this.comfortLevel = comfortLevel;
        this.material = material;
    }

    Chair(String color, int legs, boolean hasWheels) {
        System.out.println("Chair parameterized constructor (color, legs, hasWheels) invoked");
        this.color = color;
        this.legs = legs;
        this.hasWheels = hasWheels;
    }

    public void getInfo() {
        System.out.println("\n--- Chair Details ---");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Legs: " + legs);
        System.out.println("Has Wheels: " + hasWheels);
        System.out.println("Comfort Level: " + comfortLevel);
    }
}


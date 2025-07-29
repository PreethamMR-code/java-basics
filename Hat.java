class Hat {
    String brand;
    String material;
    String size;
    String color;
    String type;

    Hat(){
        System.out.println("Hat constructor is invoked");
    }

    Hat(String type, String color, String size, String material, String brand){
        System.out.println("Hat parameterized constructor is invoked");
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.brand = brand;
    }

    public void getHatInfo() {
        System.out.println("\nHat Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}
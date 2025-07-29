class HairClip {
    String color;
    String size;
    String material;
    double price;
    String brand;
    String type;

    HairClip(){
        System.out.println("HairClip constructor is invoked");
    }

    HairClip(String color, String size, String material, double price, String brand, String type){
        System.out.println("HairClip parameterized constructor is invoked");
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    public void getHairClipInfo() {
        System.out.println("\nHair Clip Details:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}
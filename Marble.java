class Marble {
    String color;
    int size;
    int weight;
    String material;
    String pattern;

    Marble(){
        System.out.println("Marble constructor is invoked");
    }

    Marble(String color, int size, int weight, String material, String pattern){
        System.out.println("Marble parameterized constructor is invoked");
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.pattern = pattern;
    }

    public void getMarbleInfo() {
        System.out.println("\nMarble Details:");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size + " mm");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Material: " + material);
        System.out.println("Pattern: " + pattern);
    }
}
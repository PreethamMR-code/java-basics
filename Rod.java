class Rod {
    String material;
    double length;
    double thickness;
    double diameter;
    double weight;

    public void getRodInfo() {
        System.out.println("\nRod Details:");
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Diameter: " + diameter + " mm");
        System.out.println("Weight: " + weight + " kg");
    }
}
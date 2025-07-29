class Rod {
    String material;
    double length;
    double thickness;
    double diameter;
    double weight;

    Rod(){
        System.out.println("Rod constructor is invoked");
    }

    Rod(String material, double length, double thickness, double diameter, double weight){
        System.out.println("Rod parameterized constructor is invoked");
        this.material = material;
        this.length = length;
        this.thickness = thickness;
        this.diameter = diameter;
        this.weight = weight;
    }

    public void getRodInfo() {
        System.out.println("\nRod Details:");
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Diameter: " + diameter + " mm");
        System.out.println("Weight: " + weight + " kg");
    }
}
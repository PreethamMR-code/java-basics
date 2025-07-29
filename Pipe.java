class Pipe {
    String material;
    double diameter;
    double length;
    String usage;
    String color;

    Pipe(){
        System.out.println("Pipe constructor is invoked");
    }

    Pipe(String material, double length, double diameter, String color, String usage){
        System.out.println("Pipe parameterized constructor is invoked");
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.color = color;
        this.usage = usage;
    }

    public void getPipeInfo() {
        System.out.println("\nPipe Details:");
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("Length: " + length + " feet");
        System.out.println("Usage: " + usage);
        System.out.println("Color: " + color);
    }
}
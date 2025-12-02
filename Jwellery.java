class Jwellery {
    String type;
    String metal;
    double weight;
    String design;
    String gemstone;

    Jwellery(){
        System.out.println("Jwellery constructor is invoked");
    }

    Jwellery(String type, String metal, double weight, String design, String gemstone){
        System.out.println("Jwellery parameterized constructor is invoked");
        this.type = type;
        this.metal = metal;
        this.weight = weight;
        this.design = design;
        this.gemstone = gemstone;
    }

    public void getJwelleryInfo() {
        System.out.println("\nJwellery Details:");
        System.out.println("Type: " + type);
        System.out.println("Metal: " + metal);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Design: " + design);
        System.out.println("Gemstone: " + gemstone);
    }
}
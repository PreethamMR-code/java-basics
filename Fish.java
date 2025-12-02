public class Fish {
    String species;
    String habitat;
    double size;
    String color;

    Fish(){
        System.out.println("Fish constructor is invoked");
    }

    Fish(String species, String habitat, double size, String color){
        System.out.println("Fish parameterized constructor is invoked");
        this.species = species;
        this.habitat = habitat;
        this.size = size;
        this.color = color;
    }

    public void getFishInfo() {
        System.out.println("\nFish Details:");
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Size: " + size + " cm");
        System.out.println("Color: " + color);
    }
}
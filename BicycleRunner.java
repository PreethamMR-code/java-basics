
class BicycleRunner {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.display();
        Bicycle b2 = new Bicycle("Trek");
        b2.display();
        Bicycle b3 = new Bicycle("Specialized", "Allez");
        b3.display();
        Bicycle b4 = new Bicycle("Cannondale", "Quick", "Hybrid");
        b4.display();
        Bicycle b5 = new Bicycle("Scott", "Speedster", "Road", 18);
        b5.display();
        Bicycle b6 = new Bicycle("Santa Cruz", "Blur", "Mountain", 12, 2000);
        b6.display();
        Bicycle b7 = new Bicycle("Giant", "Talon", "Mountain", 24, 1500, false);
        b7.display();
    }
}

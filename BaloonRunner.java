class BaloonRunner {
    public static void main(String[] args) {
        Baloon b1 = new Baloon();
        b1.display();

        Baloon b2 = new Baloon("Blue");
        b2.display();

        Baloon b3 = new Baloon("Green", "Large");
        b3.display();

        Baloon b4 = new Baloon("Yellow", "Small", "Foil");
        b4.display();

        Baloon b5 = new Baloon("Purple", "Medium", "Latex", "Helium");
        b5.display();

        Baloon b6 = new Baloon("Pink", "Giant", "Mylar", "Helium", 15.99);
        b6.display();

        Baloon b7 = new Baloon("White", "Standard", "Biodegradable", "Air", 0.75, "EcoBalloons");
        b7.display();
    }
}
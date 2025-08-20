class Planet {
    String planetName;
    String type;
    double massEarths;

    Planet() {
        this.planetName = "Earth";
        this.type = "Terrestrial";
        this.massEarths = 1.0;
    }

    void getPlanetInfo() {
        System.out.println("-----Planet Details------");
        System.out.println("Planet Name: " + planetName);
        System.out.println("Type: " + type);
        System.out.println("Mass (Earths): " + massEarths);
    }
}


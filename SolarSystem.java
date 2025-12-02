class SolarSystem {
    String starName;
    int numberOfPlanets;
    double ageBillionYears;

    Planet planet;

    SolarSystem() {
        this.starName = "Sun";
        this.numberOfPlanets = 8;
        this.ageBillionYears = 4.6;
    }

    void getSolarSystemInfo() {
        System.out.println("-------Solar System Details ------");
        System.out.println("Star Name: " + starName);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Age: " + ageBillionYears + " billion years");

        this.planet.getPlanetInfo();
    }
}


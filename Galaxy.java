class Galaxy {
    String name;
    String type;
    double diameterLightYears;

    SolarSystem solarSystem;

    Galaxy() {
        this.name = "Milky Way";
        this.type = "Spiral";
        this.diameterLightYears = 100000;
    }

    void getGalaxyInfo() {
        System.out.println("-------Galaxy Details-------");
        System.out.println("Galaxy Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameterLightYears + " light years");

        this.solarSystem.getSolarSystemInfo();
    }
}


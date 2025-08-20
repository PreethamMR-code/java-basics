class GalaxyRunner {
    public static void main(String args[]) {
        Galaxy galaxy = new Galaxy();
        SolarSystem solarSystem = new SolarSystem();
        Planet planet = new Planet();

        galaxy.solarSystem = solarSystem;
        solarSystem.planet = planet;

        galaxy.getGalaxyInfo();
    }
}
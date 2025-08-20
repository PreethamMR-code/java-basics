
class State {
    String name;
    String capital;
    long population;

    City city;

    State() {
        this.name = "Karnataka";
        this.capital = "Bengaluru";
        this.population = 64000000L;
    }

    void getStateInfo() {
        System.out.println("-------State Details ------");
        System.out.println("State Name: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population);

        this.city.getCityInfo();
    }
}

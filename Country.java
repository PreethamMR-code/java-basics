class Country {
    String name;
    String capital;
    long population;

    State state;

    Country() {
        this.name = "India";
        this.capital = "New Delhi";
        this.population = 1400000000L;
    }

    void getCountryInfo() {
        System.out.println("-------Country Details-------");
        System.out.println("Country Name: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population);

        this.state.getStateInfo();
    }
}

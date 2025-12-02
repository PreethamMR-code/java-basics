
class City {
    String name;
    String district;
    long population;

    City() {
        this.name = "Mysuru";
        this.district = "Mysuru District";
        this.population = 1000000L;
    }

    void getCityInfo() {
        System.out.println("-----City Details------");
        System.out.println("City Name: " + name);
        System.out.println("District: " + district);
        System.out.println("Population: " + population);
    }
}


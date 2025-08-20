class CountryRunner {
    public static void main(String args[]) {
        Country country = new Country();
        State state = new State();
        City city = new City();

        country.state = state;
        state.city = city;

        country.getCountryInfo();
    }
}
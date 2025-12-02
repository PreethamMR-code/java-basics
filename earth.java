class earth {

    public static void displayContinents() {
        String[] earthContinents = {
            "asia", "australia", "south america", "north america",
            "antarctica", "africa", "europe"
        };

        for (String continent : earthContinents) {
            System.out.println(continent);
        }
    }

    public static void main(String[] args) {
        displayContinents();
    }
}

class resort {

    public static void displayResorts() {
        String[] resorts = {
            "The Tamara Coorg", "Coorg Wilderness Resort & Spa", "Java Rain Resort (Chikmagalur)",
            "The Serai Chikmagalur", "Rosetta by Ferns (Sakleshpur)",
            "Trivik Hotels & Resorts Chikmagalur", "Taj Madikeri Resort & Spa, Coorg"
        };

        for (String resort : resorts) {
            System.out.println(resort);
        }
    }

    public static void main(String[] args) {
        displayResorts();
    }
}

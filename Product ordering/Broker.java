class Broker {
    public static void brokerage(String item) {
        System.out.println("Broker arranging deal for: " + item);

        Farmer.farm(item);

        System.out.println("Brokerage completed");
    }
}
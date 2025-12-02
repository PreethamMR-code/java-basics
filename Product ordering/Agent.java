class Agent {
    public static void purchase(String item) {
        System.out.println("Agent looking to purchase: " + item);

        Broker.brokerage(item);

        System.out.println("Agent completed the purchase");
    }
}
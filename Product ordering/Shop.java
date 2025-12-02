class Shop {
    public static void sell(String item) {
        System.out.println("Shop received request to sell: " + item);

        Agent.purchase(item);

        System.out.println("Shop has sold the item");
    }
}
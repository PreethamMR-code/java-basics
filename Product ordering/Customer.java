class Customer {
    public static void buy(String customerName, int age, long contact, String item) {
        System.out.println("Customer wants to buy: " + item);

        Shop.sell(item);

        System.out.println("Purchase process complete");
    }
}
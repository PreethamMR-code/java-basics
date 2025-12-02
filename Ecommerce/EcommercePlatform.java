class EcommercePlatform {
    public static void startOrder(String user, int age, long phone, String email, String product) {
        System.out.println("Order placed on the website");

        Inventory.checkStock(product);

        System.out.println("Order initiated");
    }
}
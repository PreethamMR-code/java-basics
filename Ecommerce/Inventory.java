class Inventory {
    public static void checkStock(String product) {
        System.out.println("Checking stock for: " + product);

        Warehouse.packItem();

        System.out.println("Stock confirmed");
    }
}
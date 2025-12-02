class Warehouse {
    public static void packItem() {
        System.out.println("Packing item...");

        CourierService.dispatch();

        System.out.println("Item packed");
    }
}
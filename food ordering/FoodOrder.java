class FoodOrder {
    public static void placeOrder(String customerName, int age, long phone, String email, String foodItem) {
        System.out.println("Order placing started");

        Restaurant.receiveOrder(customerName, foodItem);

        System.out.println("Order placed successfully");
    }
}
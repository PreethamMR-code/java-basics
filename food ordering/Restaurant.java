class Restaurant {
    public static void receiveOrder(String customerName, String foodItem) {
        System.out.println("Restaurant received order for " + foodItem + " from " + customerName);

        Chef.prepareFood(foodItem);

        System.out.println("Order ready for pickup");
    }
}
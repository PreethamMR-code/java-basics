class OnlineOrderTracker {
    public static void main(String[] args) {
        trackOrder(500, 3);
        trackOrder(300, 2);
        trackOrder(1000, 5);
    }

    public static void trackOrder(int price, int quantity) {
        System.out.println("Total Cost: ₹" + (price * quantity));
    }
}
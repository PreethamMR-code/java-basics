class DeliveryPerson {
    public static void pickup() {
        System.out.println("Delivery person picked up the order");

        FeedbackForm.request();
        
        System.out.println("Out for delivery");
    }
}
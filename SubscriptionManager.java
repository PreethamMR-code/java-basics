class SubscriptionManager {
    public static void main(String[] args) {
        renewSubscription(3, 150);
        renewSubscription(6, 120);
        renewSubscription(1, 180);
    }

    public static void renewSubscription(int months, int costPerMonth) {
        System.out.println("Renewal Cost: ₹" + (months * costPerMonth));
    }
}
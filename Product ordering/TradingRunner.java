class TradingRunner {
    static String customerName = "Anjali";
    static int age = 32;
    static long contact = 9876543210L;
    static String item = "Wheat";

    public static void main(String[] args) {
        System.out.println("=== Customer Info ===");
        System.out.println("Name: " + customerName);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Requested Item: " + item);

        Customer.buy(customerName, age, contact, item);
    }
}
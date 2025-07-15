class ShoppingRunner {
    static String user = "Karan";
    static int age = 35;
    static long phone = 9876543000L;
    static String email = "karan@shop.com";
    static String product = "Wireless Headphones";

    public static void main(String[] args) {
        System.out.println("Customer: " + user);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Product: " + product);

        EcommercePlatform.startOrder(user, age, phone, email, product);
    }
}
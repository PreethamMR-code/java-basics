class DeliveryRunner {
    static String customerName = "Rahul";
    static int age = 25;
    static long phone = 9876543211L;
    static String email = "rahul123@gmail.com";
    static String foodItem = "Paneer Biryani";

    public static void main(String[] args) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Food Item: " + foodItem);

        FoodOrder.placeOrder(customerName, age, phone, email, foodItem);
    }
}
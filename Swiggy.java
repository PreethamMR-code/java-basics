class Swiggy {

    static String itemName;

    public static double getAmount(String itemName) {

        double price = 0;

        if (itemName.equals("Chicken Tikka")) {
            price = 250.00;
        } 
        else if (itemName.equals("Paneer Tikka")) {
            price = 220.00;
        } 
        else if (itemName.equals("Masala Dosa")) {
            price = 80.00;
        } 
        else if (itemName.equals("Egg Roll")) {
            price = 120.00;
        } 
        else if (itemName.equals("Chicken Shawarma")) {
            price = 150.00;
        } 
        else if (itemName.equals("Veg Manchurian")) {
            price = 140.00;
        } 
        else if (itemName.equals("Chicken Lollipop")) {
            price = 200.00;
        } 
        else if (itemName.equals("Hyderabadi Dum Biryani")) {
            price = 280.00;
        } 
        else if (itemName.equals("Rajma Chawal")) {
            price = 130.00;
        } 
        else if (itemName.equals("Chana Masala")) {
            price = 160.00;
        } 
        else if (itemName.equals("Tandoori Roti")) {
            price = 30.00;
        } 
        else if (itemName.equals("Garlic Naan")) {
            price = 50.00;
        } 
        else if (itemName.equals("Hakka Noodles")) {
            price = 170.00;
        } 
        else if (itemName.equals("Spring Rolls")) {
            price = 140.00;
        } 
        else if (itemName.equals("Gulab Jamun")) {
            price = 60.00;
        } 
        else if (itemName.equals("Jalebi")) {
            price = 80.00;
        } 
        else if (itemName.equals("Fruit Salad")) {
            price = 90.00;
        } 
        else if (itemName.equals("Falooda")) {
            price = 150.00;
        } 
        else if (itemName.equals("Chocolate Milkshake")) {
            price = 130.00;
        } 
        else if (itemName.equals("Cold Coffee")) {
            price = 120.00;
        } 
        else if (itemName.equals("Veg Thukpa")) {
            price = 140.00;
        } 
        else if (itemName.equals("Chicken Soup")) {
            price = 110.00;
        } 
        else if (itemName.equals("Fish Curry")) {
            price = 240.00;
        } 
        else if (itemName.equals("Mutton Rogan Josh")) {
            price = 320.00;
        } 
        else if (itemName.equals("Palak Paneer")) {
            price = 210.00;
        } 
        else if (itemName.equals("Kadai Mushroom")) {
            price = 180.00;
        } 
        else if (itemName.equals("Mixed Veg Curry")) {
            price = 160.00;
        } 
        else if (itemName.equals("Chicken Korma")) {
            price = 270.00;
        } 
        else if (itemName.equals("Veg Frankie")) {
            price = 100.00;
        } 
        else if (itemName.equals("Cheese Pizza")) {
            price = 350.00;
        } 
        else if (itemName.equals("BBQ Chicken Wings")) {
            price = 240.00;
        } 
        else if (itemName.equals("Paneer Wrap")) {
            price = 150.00;
        } 
        else if (itemName.equals("Schezwan Rice")) {
            price = 190.00;
        } 
        else if (itemName.equals("Tandoori Chicken")) {
            price = 300.00;
        } 
        else if (itemName.equals("Fish Fry")) {
            price = 260.00;
        } 
        else if (itemName.equals("Veg Korma")) {
            price = 170.00;
        } 
        else if (itemName.equals("Mutton Curry")) {
            price = 350.00;
        } 
        else if (itemName.equals("Lemon Soda")) {
            price = 60.00;
        } 
        else if (itemName.equals("Sweet Lassi")) {
            price = 80.00;
        } 
        else if (itemName.equals("Green Tea")) {
            price = 40.00;
        } 
        else {
            System.out.println("Invalid Food Item Name");
        }

        return price;
    }

    public static void main(String[] ar) {

        double amount = getAmount("Chicken Tikka");
        System.out.println("Price for Selected Food Item is : " + amount);
    }
}

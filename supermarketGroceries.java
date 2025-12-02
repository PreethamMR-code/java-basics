class supermarketGroceries {

    public static void displayGroceries() {
        String[] superMarketGroceries = {
            "Coffee", "teabags", "milk", "Rice", "Oats",
            "powdered sugar", "Shampoo", "toothpaste", "Bread", "cookies"
        };

        for (String grocery : superMarketGroceries) {
            System.out.println(grocery);
        }
    }

    public static void main(String[] args) {
        displayGroceries();
    }
}

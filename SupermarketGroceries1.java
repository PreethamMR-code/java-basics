class SupermarketGroceries1 {

    // External Way 
    // static String g1 = "Coffee";
    // static String g2 = "teabags";
    // static String g3 = "milk";
    // static String g4 = "Rice";
    // static String g5 = "Oats";
    // static String g6 = "powdered sugar";
    // static String g7 = "Shampoo";
    // static String g8 = "toothpaste";
    // static String g9 = "Bread";
    // static String g10 = "cookies";
    // static String[] superMarketGroceries = {g1, g2, g3, g4, g5, g6, g7, g8, g9, g10};

    public static void main(String[] args) {
        System.out.println("main started");

        String g1 = "Coffee";
        String g2 = "teabags";
        String g3 = "milk";
        String g4 = "Rice";
        String g5 = "Oats";
        String g6 = "powdered sugar";
        String g7 = "Shampoo";
        String g8 = "toothpaste";
        String g9 = "Bread";
        String g10 = "cookies";

        String[] superMarketGroceries = {g1, g2, g3, g4, g5, g6, g7, g8, g9, g10};

        for (String grocery : superMarketGroceries) {
            System.out.println(grocery);
        }

        System.out.println("main ended");
    }
}

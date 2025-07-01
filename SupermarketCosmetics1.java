class SupermarketCosmetics1 {

    // External Way 
    // static String c1 = "eyeliner";
    // static String c2 = "concealer";
    // static String c3 = "foundation";
    // static String c4 = "mascara";
    // static String c5 = "lipstick";
    // static String c6 = "sunscreen";
    // static String c7 = "vitamin c serum";
    // static String c8 = "moisturizer";
    // static String c9 = "nail polish";
    // static String c10 = "face wash";
    // static String[] superMarketCosmetics = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};

    public static void main(String[] args) {
        System.out.println("main started");

        String c1 = "eyeliner";
        String c2 = "concealer";
        String c3 = "foundation";
        String c4 = "mascara";
        String c5 = "lipstick";
        String c6 = "sunscreen";
        String c7 = "vitamin c serum";
        String c8 = "moisturizer";
        String c9 = "nail polish";
        String c10 = "face wash";

        String[] superMarketCosmetics = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};

        for (String cosmetic : superMarketCosmetics) {
            System.out.println(cosmetic);
        }

        System.out.println("main ended");
    }
}

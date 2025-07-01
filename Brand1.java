class Brand1 {

    // External Way 
    // static String brand1 = "Pavitra Silk Sarees";
    // static String brand2 = "Pavitra Cotton Kurtis";
    // static String brand3 = "Pavitra Bridal Lehengas";
    // static String brand4 = "Pavitra Festive Suits";
    // static String brand5 = "Pavitra Casual Wear";
    // static String brand6 = "Pavitra Kids Collection";
    // static String brand7 = "Pavitra Mens Ethnic Wear";
    // static String brand8 = "Designer Collection (Various Designers)";
    // static String brand9 = "Traditional Handlooms";
    // static String brand10 = "Contemporary Fusion Wear";
    // static String[] brands = { brand1, brand2, brand3, brand4, brand5, brand6, brand7, brand8, brand9, brand10 };

    public static void main(String[] args) {
        System.out.println("main started");

        String brand1 = "Pavitra Silk Sarees";
        String brand2 = "Pavitra Cotton Kurtis";
        String brand3 = "Pavitra Bridal Lehengas";
        String brand4 = "Pavitra Festive Suits";
        String brand5 = "Pavitra Casual Wear";
        String brand6 = "Pavitra Kids Collection";
        String brand7 = "Pavitra Mens Ethnic Wear";
        String brand8 = "Designer Collection (Various Designers)";
        String brand9 = "Traditional Handlooms";
        String brand10 = "Contemporary Fusion Wear";

        String[] brands = {
            brand1, brand2, brand3, brand4, brand5,
            brand6, brand7, brand8, brand9, brand10
        };

        for (String brand : brands) {
            System.out.println(brand);
        }

        System.out.println("main ended");
    }
}

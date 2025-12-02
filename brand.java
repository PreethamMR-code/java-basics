class brand {

    public static void displayBrands() {
        String[] brands = {
            "Pavitra Silk Sarees", "Pavitra Cotton Kurtis", "Pavitra Bridal Lehengas",
            "Pavitra Festive Suits", "Pavitra Casual Wear", "Pavitra Kids Collection",
            "Pavitra Mens Ethnic Wear", "Designer Collection (Various Designers)",
            "Traditional Handlooms", "Contemporary Fusion Wear"
        };

        for (String brand : brands) {
            System.out.println(brand);
        }
    }

    public static void main(String[] args) {
        displayBrands();
    }
}

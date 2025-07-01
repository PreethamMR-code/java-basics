class AlcoholName1 {

    // External Way (commented)
    // static String alcohol1 = "Vodka";
    // static String alcohol2 = "Whiskey";
    // static String alcohol3 = "Rum";
    // static String alcohol4 = "Gin";
    // static String alcohol5 = "Tequila";
    // static String alcohol6 = "Brandy";
    // static String alcohol7 = "Red Wine";
    // static String alcohol8 = "White Wine";
    // static String alcohol9 = "Beer";
    // static String alcohol10 = "Champagne";
    // static String alcohol11 = "Cognac";
    // static String alcohol12 = "Sake";
    // static String[] alcohols = { alcohol1, alcohol2, alcohol3, alcohol4, alcohol5, alcohol6, alcohol7, alcohol8, alcohol9, alcohol10, alcohol11, alcohol12 };

    public static void main(String[] args) {
        System.out.println("main started");

        String alcohol1 = "Vodka";
        String alcohol2 = "Whiskey";
        String alcohol3 = "Rum";
        String alcohol4 = "Gin";
        String alcohol5 = "Tequila";
        String alcohol6 = "Brandy";
        String alcohol7 = "Red Wine";
        String alcohol8 = "White Wine";
        String alcohol9 = "Beer";
        String alcohol10 = "Champagne";
        String alcohol11 = "Cognac";
        String alcohol12 = "Sake";

        String[] alcohols = { alcohol1, alcohol2, alcohol3, alcohol4, alcohol5, alcohol6, alcohol7, alcohol8, alcohol9, alcohol10, alcohol11, alcohol12 };

        for (String alcohol : alcohols) {
            System.out.println(alcohol);
        }

        System.out.println("main ended");
    }
}

class AlcoholName {

    public static void printAlcoholNames() {
        String[] alcoholNames = {
            "Vodka", "Whiskey", "Rum", "Gin", "Tequila",
            "Brandy", "Red Wine", "White Wine", "Beer",
            "Champagne", "Cognac", "Sake"
        };

        for (String alcohol : alcoholNames) {
            System.out.println(alcohol);
        }
    }

    public static void main(String[] args) {
        printAlcoholNames(); 
    }
}

class supermarketCosmetics {

    public static void displayCosmetics() {
        String[] superMarketCosmetics = {
            "eyeliner", "concealer", "foundation", "mascara", "lipstick",
            "sunscreen", "vitamin c serum", "moisturizer", "nail polish", "face wash"
        };

        for (String cosmetic : superMarketCosmetics) {
            System.out.println(cosmetic);
        }
    }

    public static void main(String[] args) {
        displayCosmetics();
    }
}

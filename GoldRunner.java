class GoldRunner {
    public static void main(String[] args) {
        boolean result = Gold.registerGold("Gold Necklace", 25.5, "22K", "Traditional", "Tanishq", 152000.0);

        System.out.println("Gold Registered: " + result);

        if (result) {
            Gold.getGoldDetails();
        }
    }
}

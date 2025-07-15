class MarketRunner {
    public static void main(String[] args) {
        boolean result = Market.registerMarket("Green Valley Bazaar", "BTM Layout", 120, "Fresh Produce", "9AM - 9PM");

        System.out.println("Market Registered: " + result);

        if (result) {
            Market.getMarketDetails();
        }
    }
}

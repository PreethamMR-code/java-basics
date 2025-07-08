class stockName {

    public static void displayStockNames() {
        String[] stockNames = {
            "Reliance Industries", "HDFC Bank", "Tata Consultancy Services (TCS)",
            "ICICI Bank", "Infosys", "State Bank of India (SBI)", "Bharti Airtel",
            "Hindustan Unilever (HUL)", "Bajaj Finance", "Larsen & Toubro (L&T)"
        };

        for (String stock : stockNames) {
            System.out.println(stock);
        }
    }

    public static void main(String[] args) {
        displayStockNames();
    }
}

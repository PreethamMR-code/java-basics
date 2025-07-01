class StockName1 {

    // External Way 
    // static String s1 = "Reliance Industries";
    // static String s2 = "HDFC Bank";
    // static String s3 = "Tata Consultancy Services (TCS)";
    // static String s4 = "ICICI Bank";
    // static String s5 = "Infosys";
    // static String s6 = "State Bank of India (SBI)";
    // static String s7 = "Bharti Airtel";
    // static String s8 = "Hindustan Unilever (HUL)";
    // static String s9 = "Bajaj Finance";
    // static String s10 = "Larsen & Toubro (L&T)";
    // static String[] stockNames = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

    public static void main(String[] args) {
        System.out.println("main started");

        String s1 = "Reliance Industries";
        String s2 = "HDFC Bank";
        String s3 = "Tata Consultancy Services (TCS)";
        String s4 = "ICICI Bank";
        String s5 = "Infosys";
        String s6 = "State Bank of India (SBI)";
        String s7 = "Bharti Airtel";
        String s8 = "Hindustan Unilever (HUL)";
        String s9 = "Bajaj Finance";
        String s10 = "Larsen & Toubro (L&T)";

        String[] stockNames = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        for (String stock : stockNames) {
            System.out.println(stock);
        }

        System.out.println("main ended");
    }
}

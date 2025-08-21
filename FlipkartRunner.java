class FlipkartRunner {
    public static void main(String[] args) {
        boolean result = Flipkart.createFlipkart("Flipkart", "Sachin Bansal", 2007, "Bengaluru, India", true, 30000);

        System.out.println("Flipkart Created: " + result);

        if (result) {
            Flipkart.readFlipkart();
        }
    }
}
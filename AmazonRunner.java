class AmazonRunner {
    public static void main(String[] args) {
        boolean result = Amazon.createAmazon("Amazon", "Jeff Bezos", 1994, "Seattle, Washington", true);

        System.out.println("Amazon Website Created: " + result);

        if (result) {
            Amazon.readAmazon();
        }
    }
}

class FacebookRunner {
    public static void main(String[] args) {
        boolean result = Facebook.createFacebook("Facebook", "Mark Zuckerberg", 2004, "Menlo Park, California", true, 2000000000);

        System.out.println("Facebook Created: " + result);

        if (result) {
            Facebook.readFacebook();
        }
    }
}

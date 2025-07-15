class LinkedInRunner {
    public static void main(String[] args) {
        boolean result = LinkedIn.createLinkedIn("LinkedIn", "Reid Hoffman", 2003, "Sunnyvale, California", true, 1000000000);

        System.out.println("LinkedIn Created: " + result);

        if (result) {
            LinkedIn.readLinkedIn();
        }
    }
}

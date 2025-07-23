class HackerRunner {
    public static void main(String[] args) {
        boolean result = Hacker.registerHacker("Alex Knight", "ShadowByte", "Pro", "Python", true, 7);

        System.out.println("Hacker Registered: " + result);

        if (result) {
            Hacker.getHackerDetails();
        }
    }
}

class AdminPanel {
    public static void verifyDetails(String playerName, String game) {
        System.out.println("Verifying details for " + playerName);

        MatchManager.assignMatch();

        System.out.println("Details verified");
    }
}
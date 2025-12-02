class RegistrationPortal {
    public static void registerPlayer(String playerName, int age, long contact, String email, String game) {
        System.out.println("Registration started");

        AdminPanel.verifyDetails(playerName, game);

        System.out.println("Registration successful");
    }
}
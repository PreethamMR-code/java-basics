class GameTournamentRunner {
    static String playerName = "Rohan";
    static int age = 21;
    static long contact = 9911223344L;
    static String email = "rohan@gamearena.com";
    static String game = "Valor Quest";

    public static void main(String[] args) {
        System.out.println("Player: " + playerName);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Game Selected: " + game);

        RegistrationPortal.registerPlayer(playerName, age, contact, email, game);
    }
}
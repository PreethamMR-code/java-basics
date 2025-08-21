class NetflixRunner {
    public static void main(String[] args) {
        boolean result = Netflix.createNetflix("Netflix", "Reed Hastings", 1997, "Los Gatos, California", true, 270000000);

        System.out.println("Netflix Created: " + result);

        if (result) {
            Netflix.readNetflix();
        }
    }
}
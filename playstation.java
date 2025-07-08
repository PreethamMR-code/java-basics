class playstation {

    public static void displayPlaystationGames() {
        String[] playstationGames = {
            "The Last of Us Part II", "God of War Ragnarök", "Marvel's Spider-Man 2",
            "Horizon Forbidden West", "Ghost of Tsushima", "Final Fantasy VII Remake",
            "Elden Ring", "Resident Evil 4 Remake", "Ratchet & Clank: Rift Apart", "Stray"
        };

        for (String game : playstationGames) {
            System.out.println(game);
        }
    }

    public static void main(String[] args) {
        displayPlaystationGames();
    }
}

class Playstation1 {

    // External Way 
    // static String game1 = "The Last of Us Part II";
    // static String game2 = "God of War Ragnarök";
    // static String game3 = "Marvel's Spider-Man 2";
    // static String game4 = "Horizon Forbidden West";
    // static String game5 = "Ghost of Tsushima";
    // static String game6 = "Final Fantasy VII Remake";
    // static String game7 = "Elden Ring";
    // static String game8 = "Resident Evil 4 Remake";
    // static String game9 = "Ratchet & Clank: Rift Apart";
    // static String game10 = "Stray";
    // static String[] playstationGames = {game1, game2, game3, game4, game5, game6, game7, game8, game9, game10};

    public static void main(String[] args) {
        System.out.println("main started");

        String game1 = "The Last of Us Part II";
        String game2 = "God of War Ragnarök";
        String game3 = "Marvel's Spider-Man 2";
        String game4 = "Horizon Forbidden West";
        String game5 = "Ghost of Tsushima";
        String game6 = "Final Fantasy VII Remake";
        String game7 = "Elden Ring";
        String game8 = "Resident Evil 4 Remake";
        String game9 = "Ratchet & Clank: Rift Apart";
        String game10 = "Stray";

        String[] playstationGames = {game1, game2, game3, game4, game5, game6, game7, game8, game9, game10};

        for (String game : playstationGames) {
            System.out.println(game);
        }

        System.out.println("main ended");
    }
}

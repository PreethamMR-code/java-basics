class SpotifyRunner {
    public static void main(String[] args) {
        boolean result = Spotify.createSpotify("Spotify", "Daniel Ek", 2008, "Stockholm, Sweden", true, 600000000);

        System.out.println("Spotify Created: " + result);

        if (result) {
            Spotify.readSpotify();
        }
    }
}
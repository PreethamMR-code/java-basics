class YouTubeRunner {
    public static void main(String[] args) {
        boolean result = YouTube.createYouTube("YouTube", "Chad Hurley", 2005, "San Bruno, California", true, 51000000);

        System.out.println("YouTube Created: " + result);

        if (result) {
            YouTube.readYouTube();
        }
    }
}

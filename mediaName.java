class mediaName {

    public static void displayMediaNames() {
        String[] mediaNames = {
            "Facebook", "Instagram", "Twitter", "LinkedIn", "TikTok",
            "Snapchat", "Pinterest", "YouTube", "Reddit", "Threads"
        };

        for (String media : mediaNames) {
            System.out.println(media);
        }
    }

    public static void main(String[] args) {
        displayMediaNames();
    }
}

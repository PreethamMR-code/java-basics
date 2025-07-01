class MediaName1 {

    // External Way 
    // static String media1 = "Facebook";
    // static String media2 = "Instagram";
    // static String media3 = "Twitter";
    // static String media4 = "LinkedIn";
    // static String media5 = "TikTok";
    // static String media6 = "Snapchat";
    // static String media7 = "Pinterest";
    // static String media8 = "YouTube";
    // static String media9 = "Reddit";
    // static String media10 = "Threads";
    // static String[] mediaNames = {media1, media2, media3, media4, media5, media6, media7, media8, media9, media10};

    public static void main(String[] args) {
        System.out.println("main started");

        String media1 = "Facebook";
        String media2 = "Instagram";
        String media3 = "Twitter";
        String media4 = "LinkedIn";
        String media5 = "TikTok";
        String media6 = "Snapchat";
        String media7 = "Pinterest";
        String media8 = "YouTube";
        String media9 = "Reddit";
        String media10 = "Threads";

        String[] mediaNames = {media1, media2, media3, media4, media5, media6, media7, media8, media9, media10};

        for (String media : mediaNames) {
            System.out.println(media);
        }

        System.out.println("main ended");
    }
}

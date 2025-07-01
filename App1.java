class App1 {

    // External Way 
    // static String app1 = "WhatsApp Messenger";
    // static String app2 = "Instagram";
    // static String app3 = "TikTok";
    // static String app4 = "YouTube";
    // static String app5 = "Google Maps";
    // static String app6 = "Spotify";
    // static String app7 = "Netflix";
    // static String app8 = "Gmail";
    // static String app9 = "Uber";
    // static String app10 = "Amazon Shopping";
    // static String[] apps = { app1, app2, app3, app4, app5, app6, app7, app8, app9, app10 };

    public static void main(String[] args) {
        System.out.println("main started");

        String app1 = "WhatsApp Messenger";
        String app2 = "Instagram";
        String app3 = "TikTok";
        String app4 = "YouTube";
        String app5 = "Google Maps";
        String app6 = "Spotify";
        String app7 = "Netflix";
        String app8 = "Gmail";
        String app9 = "Uber";
        String app10 = "Amazon Shopping";

        String[] apps = { app1, app2, app3, app4, app5, app6, app7, app8, app9, app10 };

        for (String app : apps) {
            System.out.println(app);
        }

        System.out.println("main ended");
    }
}

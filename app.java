class App {

    public static void displayAppNames() {
        String[] appNames = {
            "WhatsApp Messenger", "Instagram", "TikTok", "YouTube", 
            "Google Maps", "Spotify", "Netflix", "Gmail", 
            "Uber", "Amazon Shopping"
        };

        for (String app : appNames) {
            System.out.println(app);
        }
    }

    public static void main(String[] args) {
        displayAppNames(); 
    }
}

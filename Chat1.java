class Chat1 {

    // External Way 
    // static String chat1 = "pani puri";
    // static String chat2 = "dahi puri";
    // static String chat3 = "masala puri";
    // static String chat4 = "bhel puri";
    // static String chat5 = "gobi";
    // static String chat6 = "pav bhaji";
    // static String chat7 = "golgoppa";
    // static String chat8 = "samosa";
    // static String chat9 = "bonda";
    // static String chat10 = "bread butter";
    // static String[] chatShop = {chat1, chat2, chat3, chat4, chat5, chat6, chat7, chat8, chat9, chat10};

    public static void main(String[] args) {
        System.out.println("main started");

        String chat1 = "pani puri";
        String chat2 = "dahi puri";
        String chat3 = "masala puri";
        String chat4 = "bhel puri";
        String chat5 = "gobi";
        String chat6 = "pav bhaji";
        String chat7 = "golgoppa";
        String chat8 = "samosa";
        String chat9 = "bonda";
        String chat10 = "bread butter";

        String[] chatShop = {
            chat1, chat2, chat3, chat4, chat5,
            chat6, chat7, chat8, chat9, chat10
        };

        for (String chat : chatShop) {
            System.out.println(chat);
        }

        System.out.println("main ended");
    }
}

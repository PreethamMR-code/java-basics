class chat {

    public static void displayChatItems() {
        String[] chatShop = {
            "pani puri", "dahi puri", "masala puri", "bhel puri",
            "gobi", "pav bhaji", "golgoppa", "samosa", "bonda", "bread butter"
        };

        for (String chat : chatShop) {
            System.out.println(chat);
        }
    }

    public static void main(String[] args) {
        displayChatItems();
    }
}

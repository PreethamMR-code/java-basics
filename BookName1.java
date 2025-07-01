class BookName1 {

    // External Way 
    // static String book1 = "Mahabharata";
    // static String book2 = "Ramayana";
    // static String book3 = "Bhagavad Gita";
    // static String book4 = "Devi Mahatmyam";
    // static String book5 = "Puranas";
    // static String book6 = "Vishnu Purana";
    // static String book7 = "Shiva Purana";
    // static String book8 = "The Palace of Illusions";
    // static String[] bookNames = { book1, book2, book3, book4, book5, book6, book7, book8 };

    public static void main(String[] args) {
        System.out.println("main started");

        String book1 = "Mahabharata";
        String book2 = "Ramayana";
        String book3 = "Bhagavad Gita";
        String book4 = "Devi Mahatmyam";
        String book5 = "Puranas";
        String book6 = "Vishnu Purana";
        String book7 = "Shiva Purana";
        String book8 = "The Palace of Illusions";

        String[] bookNames = { book1, book2, book3, book4, book5, book6, book7, book8 };

        for (String book : bookNames) {
            System.out.println(book);
        }

        System.out.println("main ended");
    }
}

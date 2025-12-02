class bookName {

    public static void displayBookNames() {
        String[] bookNames = {
            "Mahabharata", "Ramayana", "Bhagavad Gita", "Devi Mahatmyam",
            "Puranas", "Vishnu Purana", "Shiva Purana", "The Palace of Illusions"
        };

        for (String book : bookNames) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        displayBookNames(); 
    }
}

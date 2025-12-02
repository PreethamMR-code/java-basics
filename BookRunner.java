class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Great Adventure";
        book1.author = "Jane Doe";
        book1.pages = 300;
        book1.price = 25.50;
        book1.getInfo();

        Book book2 = new Book("Mystery of the Old House", "John Smith");
        book2.pages = 250;
        book2.price = 19.99;
        book2.getInfo();

        Book book3 = new Book();
        book3.title = "Coding Basics";
        book3.author = "Alice Wonderland";
        book3.pages = 500;
        book3.price = 45.00;
        book3.getInfo();

        Book book4 = new Book("Sci-Fi Odyssey", "Arthur Clarke");
        book4.pages = 400;
        book4.price = 30.00;
        book4.getInfo();

        Book book5 = new Book();
        book5.title = "Fantasy Realm";
        book5.author = "G.R.R. Martin";
        book5.pages = 800;
        book5.price = 35.75;
        book5.getInfo();
    }
}
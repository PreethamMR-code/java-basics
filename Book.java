class Book {
    String title;
    String author;
    int pages;
    double price;

    Book() {
        System.out.println("Book constructor invoked");
    }

    Book(String title, String author) {
        System.out.println("Book parameterized constructor invoked");
        this.title = title;
        this.author = author;
    }

    public void getInfo() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
    }
}

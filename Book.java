class Book {

    String bName;
    String isbnNo;
    String author;
    String publisher;
    double price;

    Book() {
        this.bName = "Core Java";
        this.isbnNo = "ISBN123";
        this.author = "Oracle";
        this.publisher = "Bharath";
        this.price = 599.00;

    }

    void bookInfo() {

        System.out.println("......Book Details.....");
        System.out.println("Book Name :" + bName);
        System.out.println("Book ISBN Number :" + isbnNo);
        System.out.println("Book Author :" + author);
        System.out.println("Book Publisher :" + publisher);
        System.out.println("Book Price :" + price);

    }
}
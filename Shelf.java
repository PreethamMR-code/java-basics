class Shelf {

    String sName;
    int sNo;
    int noOfBooks;
    String stype;

    Book book;

    Shelf() {
        this.sName = "Upper Shelf";
        this.sNo = 05;
        this.noOfBooks = 25;
        this.stype = "Novels";
    }

    void getShelfInfo() {
        System.out.println("......Shelf Details......");
        System.out.println("Shelf Name :" + sName);
        System.out.println("Shelf Number :" + sNo);
        System.out.println("Number of books in Shelf :" + noOfBooks);
        System.out.println("Shelf type :" + stype);

        this.book.bookInfo();
    }

}
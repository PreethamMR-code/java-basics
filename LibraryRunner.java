class LibraryRunner {

    public static void main(String s[]) {

        Library lib = new Library();

        Shelf shelf = new Shelf();
        Book book = new Book();

        lib.shelf = shelf;
        shelf.book = book;

        lib.getLibraryInfo();
    }
}
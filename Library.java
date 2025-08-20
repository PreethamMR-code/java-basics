class Library {


    String lName;
    String lType;
    String location;
    int noOfShelf;

    Shelf shelf;

    Library() {

        this.lName = "College Library";

        this.lType = "Private";

        this.location = "Kempapura";

        this.noOfShelf = 10;

    }

    void getLibraryInfo() {



        System.out.println(".....Library Detail....");
        System.out.println("Library Nmae :" + lName);
        System.out.println("Library Type :" + lType);
        System.out.println("Library Location :" + location);
        System.out.println("Library No of Shelf :" + noOfShelf);

        this.shelf.getShelfInfo();



    }

}
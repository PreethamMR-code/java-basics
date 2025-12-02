class Block {
    String blockName;
    int floors;
    double areaSqFeet;

    Company company;

    Block() {
        this.blockName = "Block A";
        this.floors = 10;
        this.areaSqFeet = 50000.0;
    }

    void getBlockInfo() {
        System.out.println("-------Block Details ------");
        System.out.println("Block Name: " + blockName);
        System.out.println("Number of Floors: " + floors);
        System.out.println("Area: " + areaSqFeet + " sq feet");

        this.company.getCompanyInfo();
    }
}


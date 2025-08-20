class TechPark {
    String name;
    String location;
    double areaAcres;

    Block block;

    TechPark() {
        this.name = "Electronic City";
        this.location = "Bengaluru";
        this.areaAcres = 332.0;
    }

    void getTechParkInfo() {
        System.out.println("-------Tech Park Details-------");
        System.out.println("Tech Park Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Area: " + areaAcres + " acres");

        this.block.getBlockInfo();
    }
}

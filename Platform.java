class Platform {
    String platformNumber;
    String destinationRoute;
    String busType;

    Bus bus;

    Platform() {
        this.platformNumber = "P10";
        this.destinationRoute = "Mysuru";
        this.busType = "Volvo";
    }

    void getPlatformInfo() {
        System.out.println("-----Platform Details------");
        System.out.println("Platform Number: " + platformNumber);
        System.out.println("Destination Route: " + destinationRoute);
        System.out.println("Bus Type: " + busType);

        this.bus.getBusInfo();
    }
}

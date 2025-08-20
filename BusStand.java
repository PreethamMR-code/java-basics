class BusStand {
    String standName;
    String area;
    int busesOperating;

    Platform platform;

    BusStand() {
        this.standName = "Kempegowda Bus Stand";
        this.area = "Majestic";
        this.busesOperating = 1000;
    }

    void getBusStandInfo() {
        System.out.println("-------Bus Stand Details ------");
        System.out.println("Stand Name: " + standName);
        System.out.println("Area: " + area);
        System.out.println("Buses Operating: " + busesOperating);

        this.platform.getPlatformInfo();
    }
}

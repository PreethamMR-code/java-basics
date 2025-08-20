class Majestic {
    String stationName;
    String city;
    int totalPlatforms;

    BusStand busStand;

    Majestic() {
        this.stationName = "Majestic Bus Station";
        this.city = "Bengaluru";
        this.totalPlatforms = 50;
    }

    void getMajesticInfo() {
        System.out.println("-------Majestic Details-------");
        System.out.println("Station Name: " + stationName);
        System.out.println("City: " + city);
        System.out.println("Total Platforms: " + totalPlatforms);

        this.busStand.getBusStandInfo();
    }
}

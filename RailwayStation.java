class RailwayStation {
    String stationName;
    String city;
    int numberOfPlatforms;

    Train train;

    RailwayStation() {
        this.stationName = "Bengaluru City Junction";
        this.city = "Bengaluru";
        this.numberOfPlatforms = 10;
    }

    void getRailwayStationInfo() {
        System.out.println("-------Railway Station Details-------");
        System.out.println("Station Name: " + stationName);
        System.out.println("City: " + city);
        System.out.println("Number of Platforms: " + numberOfPlatforms);

        this.train.getTrainInfo();
    }
}

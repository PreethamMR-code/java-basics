class RailwayStationRunner {
    public static void main(String args[]) {
        RailwayStation railwayStation = new RailwayStation();
        Train train = new Train();

        railwayStation.train = train;

        railwayStation.getRailwayStationInfo();
    }
}
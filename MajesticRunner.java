class MajesticRunner {
    public static void main(String args[]) {
        Majestic majestic = new Majestic();
        BusStand busStand = new BusStand();
        Platform platform = new Platform();
        Bus bus = new Bus();

        majestic.busStand = busStand;
        busStand.platform = platform;
        platform.bus = bus;

        majestic.getMajesticInfo();
    }
}
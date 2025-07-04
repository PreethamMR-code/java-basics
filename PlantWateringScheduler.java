class PlantWateringScheduler {
    public static void main(String[] args) {
        scheduleWatering(5, 2);
        scheduleWatering(8, 3);
        scheduleWatering(3, 1);
    }

    public static void scheduleWatering(int plants, int days) {
        int totalSessions = plants * days;
        System.out.println("Watering Sessions Scheduled: " + totalSessions);
    }
}

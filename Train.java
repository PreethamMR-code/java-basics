class Train {
    String trainNumber;
    String trainName;
    String destination;
    String departureTime;
    int coaches;

    Train() {
        this.trainNumber = "12657";
        this.trainName = "Karnataka Express";
        this.destination = "New Delhi";
        this.departureTime = "20:00";
        this.coaches = 24;
    }

    void getTrainInfo() {
        System.out.println("-------Train Details ------");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Number of Coaches: " + coaches);
    }
}

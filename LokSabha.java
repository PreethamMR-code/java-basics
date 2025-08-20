class LokSabha {
    int totalSeats;
    String currentSpeaker;
    String sessionYear;

    Seat seat;

    LokSabha() {
        this.totalSeats = 543;
        this.currentSpeaker = "Om Birla";
        this.sessionYear = "2024-2029";
    }

    void getLokSabhaInfo() {
        System.out.println("-------Lok Sabha Details-------");
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Current Speaker: " + currentSpeaker);
        System.out.println("Session Year: " + sessionYear);

        this.seat.getSeatInfo();
    }
}

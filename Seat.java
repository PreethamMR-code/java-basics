class Seat {
    String constituency;
    String state;
    int seatNumber;

    Politician politician;

    Seat() {
        this.constituency = "Bengaluru South";
        this.state = "Karnataka";
        this.seatNumber = 28;
    }

    void getSeatInfo() {
        System.out.println("-------Seat Details ------");
        System.out.println("Constituency: " + constituency);
        System.out.println("State: " + state);
        System.out.println("Seat Number: " + seatNumber);

        this.politician.getPoliticianInfo();
    }
}

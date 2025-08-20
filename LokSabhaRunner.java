class LokSabhaRunner {
    public static void main(String args[]) {
        LokSabha lokSabha = new LokSabha();
        Seat seat = new Seat();
        Politician politician = new Politician();

        lokSabha.seat = seat;
        seat.politician = politician;

        lokSabha.getLokSabhaInfo();
    }
}
class Bus {
    String busNumber;
    String operator;
    int seatingCapacity;

    Bus() {
        this.busNumber = "KA01AB1234";
        this.operator = "KSRTC";
        this.seatingCapacity = 45;
    }

    void getBusInfo() {
        System.out.println("-----Bus Details------");
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Operator: " + operator);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

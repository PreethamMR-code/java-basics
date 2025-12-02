class SignalRunner {
    public static void main(String[] args) {
        boolean result = Signal.registerSignal("MG Road Junction", "Pedestrian + Vehicle", 45, true, "Red", "North-South");

        System.out.println("Signal Registered: " + result);

        if (result) {
            Signal.getSignalDetails();
        }
    }
}

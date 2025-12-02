class WalkieTalkieRunner {
    public static void main(String[] args) {
        boolean result = WalkieTalkie.registerWalkieTalkie("Motorola", "T600", 8000, true, 14, "Black");

        System.out.println("Walkie Talkie Registered: " + result);

        if (result) {
            WalkieTalkie.getWalkieTalkieDetails();
        }
    }
}

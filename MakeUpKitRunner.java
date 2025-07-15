class MakeUpKitRunner {
    public static void main(String[] args) {
        boolean result = MakeUpKit.registerMakeUpKit("GlowUp Combo", "Lakmé", 12, true, "Rose Gold", 2499.0);

        System.out.println("MakeUp Kit Registered: " + result);

        if (result) {
            MakeUpKit.getMakeUpKitDetails();
        }
    }
}

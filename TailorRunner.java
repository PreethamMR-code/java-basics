class TailorRunner {
    public static void main(String[] args) {
        boolean result = Tailor.registerTailor("Ravi Tailors", "Rajajinagar", 12, "Bridal Wear", true, 850.0);

        System.out.println("Tailor Registered: " + result);

        if (result) {
            Tailor.getTailorDetails();
        }
    }
}

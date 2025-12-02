class Tailor {
    static String tailorName;
    static String shopLocation;
    static int yearsOfExperience;
    static String specialty; // e.g., Men's suits, Bridal wear
    static boolean homeServiceAvailable;
    static double stitchingChargePerDress;

    public static boolean registerTailor(String name, String location, int experience, String skill, boolean homeService, double charge) {
        boolean isTailorRegistered = false;

        boolean nameOk = false;
        boolean locationOk = false;
        boolean experienceOk = false;
        boolean skillOk = false;
        boolean homeServiceOk = false;
        boolean chargeOk = false;

        if (name != null && !name.isEmpty()) {
            tailorName = name;
            nameOk = true;
        } else {
            System.out.println("Tailor name is required.");
        }

        if (location != null && !location.isEmpty()) {
            shopLocation = location;
            locationOk = true;
        } else {
            System.out.println("Shop location is missing.");
        }

        if (experience >= 0) {
            yearsOfExperience = experience;
            experienceOk = true;
        } else {
            System.out.println("Experience must be zero or more.");
        }

        if (skill != null && !skill.isEmpty()) {
            specialty = skill;
            skillOk = true;
        } else {
            System.out.println("Specialty is required.");
        }

        homeServiceAvailable = homeService;
        homeServiceOk = true;

        if (charge > 0) {
            stitchingChargePerDress = charge;
            chargeOk = true;
        } else {
            System.out.println("Stitching charge must be positive.");
        }

        if (nameOk && locationOk && experienceOk && skillOk && homeServiceOk && chargeOk) {
            isTailorRegistered = true;
        } else {
            System.out.println("Tailor registration failed.");
        }

        return isTailorRegistered;
    }

    public static void getTailorDetails() {
        System.out.println("Tailor Name: " + tailorName);
        System.out.println("Shop Location: " + shopLocation);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("Specialty: " + specialty);
        System.out.println("Home Service Available: " + homeServiceAvailable);
        System.out.println("Stitching Charge Per Dress: ₹" + stitchingChargePerDress);
    }
}

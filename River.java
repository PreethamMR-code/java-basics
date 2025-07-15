class River {
    static String riverName;
    static String originPlace;
    static double lengthInKm;
    static String flowsThroughStates;
    static boolean isPerennial;
    static String endsAt;

    public static boolean registerRiver(String name, String origin, double length, String states, boolean perennial, String endPoint) {
        boolean isRiverRegistered = false;

        boolean nameOk = false;
        boolean originOk = false;
        boolean lengthOk = false;
        boolean statesOk = false;
        boolean perennialOk = false;
        boolean endOk = false;

        if (name != null && !name.isEmpty()) {
            riverName = name;
            nameOk = true;
        } else {
            System.out.println("River name is required.");
        }

        if (origin != null && !origin.isEmpty()) {
            originPlace = origin;
            originOk = true;
        } else {
            System.out.println("Origin place is missing.");
        }

        if (length > 0) {
            lengthInKm = length;
            lengthOk = true;
        } else {
            System.out.println("Length must be greater than 0.");
        }

        if (states != null && !states.isEmpty()) {
            flowsThroughStates = states;
            statesOk = true;
        } else {
            System.out.println("Please mention states the river flows through.");
        }

        isPerennial = perennial;
        perennialOk = true;

        if (endPoint != null && !endPoint.isEmpty()) {
            endsAt = endPoint;
            endOk = true;
        } else {
            System.out.println("Ending location is required.");
        }

        if (nameOk && originOk && lengthOk && statesOk && perennialOk && endOk) {
            isRiverRegistered = true;
        } else {
            System.out.println("River registration failed.");
        }

        return isRiverRegistered;
    }

    public static void getRiverDetails() {
        System.out.println("River Name: " + riverName);
        System.out.println("Origin: " + originPlace);
        System.out.println("Length: " + lengthInKm + " km");
        System.out.println("Flows Through: " + flowsThroughStates);
        System.out.println("Is Perennial: " + isPerennial);
        System.out.println("Ends At: " + endsAt);
    }
}

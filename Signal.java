class Signal {
    static String signalLocation;
    static String signalType;
    static int timerInSeconds;
    static boolean hasCamera;
    static String lightColor;
    static String directionControlled;

    public static boolean registerSignal(String location, String type, int timer, boolean camera, String color, String direction) {
        boolean isSignalRegistered = false;

        boolean locationOk = false;
        boolean typeOk = false;
        boolean timerOk = false;
        boolean cameraOk = false;
        boolean colorOk = false;
        boolean directionOk = false;

        if (location != null && !location.isEmpty()) {
            signalLocation = location;
            locationOk = true;
        } else {
            System.out.println("Signal location is missing.");
        }

        if (type != null && !type.isEmpty()) {
            signalType = type;
            typeOk = true;
        } else {
            System.out.println("Signal type is required.");
        }

        if (timer > 0) {
            timerInSeconds = timer;
            timerOk = true;
        } else {
            System.out.println("Set a valid timer duration.");
        }

        hasCamera = camera;
        cameraOk = true;

        if (color != null && !color.isEmpty()) {
            lightColor = color;
            colorOk = true;
        } else {
            System.out.println("Please mention the light color.");
        }

        if (direction != null && !direction.isEmpty()) {
            directionControlled = direction;
            directionOk = true;
        } else {
            System.out.println("Direction controlled by the signal is needed.");
        }

        if (locationOk && typeOk && timerOk && cameraOk && colorOk && directionOk) {
            isSignalRegistered = true;
        } else {
            System.out.println("Signal registration failed.");
        }

        return isSignalRegistered;
    }

    public static void getSignalDetails() {
        System.out.println("Signal Location: " + signalLocation);
        System.out.println("Signal Type: " + signalType);
        System.out.println("Timer Duration: " + timerInSeconds + " seconds");
        System.out.println("Camera Present: " + hasCamera);
        System.out.println("Light Color: " + lightColor);
        System.out.println("Direction Controlled: " + directionControlled);
    }
}

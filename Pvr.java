class Pvr {

    String pvrName;
    String location;
    int screens;

    Screen screen;

    Pvr() {
        this.pvrName = "PVR Cinemas";
        this.location = "Forum Mall";
        this.screens = 7;
    }

    void getPvrInfo() {
        System.out.println("-------PVR Details-------");
        System.out.println("PVR Name is: " + pvrName);
        System.out.println("Location is: " + location);
        System.out.println("Number of Screens: " + screens);

        this.screen.getScreenInfo();
    }
}

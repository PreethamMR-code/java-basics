class SpeakerRunner {
    public static void main(String[] args) {
        Speaker sp1 = new Speaker();
        sp1.brand = "JBL";
        sp1.type = "Portable";
        sp1.wattage = 20;
        sp1.isBluetooth = true;
        sp1.color = "Black";
        sp1.getInfo();

        Speaker sp2 = new Speaker("Bose", "Soundbar", 100);
        sp2.isBluetooth = true;
        sp2.color = "Black";
        sp2.getInfo();

        Speaker sp3 = new Speaker(false, "White", "Sonos");
        sp3.type = "Smart Speaker";
        sp3.wattage = 30;
        sp3.getInfo();

        Speaker sp4 = new Speaker("Bookshelf", "Wood Grain", false);
        sp4.brand = "Klipsch";
        sp4.wattage = 75;
        sp4.getInfo();

        Speaker sp5 = new Speaker();
        sp5.brand = "Marshall";
        sp5.type = "Bluetooth";
        sp5.wattage = 50;
        sp5.isBluetooth = true;
        sp5.color = "Cream";
        sp5.getInfo();
    }
}
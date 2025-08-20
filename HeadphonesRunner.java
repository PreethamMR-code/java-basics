class HeadphonesRunner {
    public static void main(String[] args) {
        Headphones hp1 = new Headphones();
        hp1.brand = "Sony";
        hp1.type = "Over-ear";
        hp1.connectionType = "Wireless";
        hp1.hasNoiseCancellation = true;
        hp1.price = 299.99;
        hp1.getInfo();

        Headphones hp2 = new Headphones("Bose", "On-ear", "Wireless");
        hp2.hasNoiseCancellation = true;
        hp2.price = 249.00;
        hp2.getInfo();

        Headphones hp3 = new Headphones(false, 99.99, "JBL");
        hp3.type = "In-ear";
        hp3.connectionType = "Wired";
        hp3.getInfo();

        Headphones hp4 = new Headphones("Wired", 49.99, false);
        hp4.brand = "Sennheiser";
        hp4.type = "Over-ear";
        hp4.getInfo();

        Headphones hp5 = new Headphones();
        hp5.brand = "Apple";
        hp5.type = "In-ear";
        hp5.connectionType = "Wireless";
        hp5.hasNoiseCancellation = true;
        hp5.price = 199.00;
        hp5.getInfo();
    }
}
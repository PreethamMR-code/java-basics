class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.material = "Plastic";
        bottle1.capacityLiters = 1.0;
        bottle1.color = "Clear";
        bottle1.capType = "Screw-top";
        bottle1.isInsulated = false;
        bottle1.getInfo();

        Bottle bottle2 = new Bottle("Stainless Steel", 0.75, "Blue");
        bottle2.capType = "Flip-top";
        bottle2.isInsulated = true;
        bottle2.getInfo();

        Bottle bottle3 = new Bottle("Straw Lid", true, "Glass");
        bottle3.capacityLiters = 0.5;
        bottle3.color = "Transparent";
        bottle3.getInfo();

        Bottle bottle4 = new Bottle("Black", "Sports Cap", 1.5);
        bottle4.material = "Aluminum";
        bottle4.isInsulated = false;
        bottle4.getInfo();

        Bottle bottle5 = new Bottle();
        bottle5.material = "Glass";
        bottle5.capacityLiters = 0.6;
        bottle5.color = "Green";
        bottle5.capType = "Swing-top";
        bottle5.isInsulated = false;
        bottle5.getInfo();
    }
}
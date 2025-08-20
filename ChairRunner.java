class ChairRunner {
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        chair1.material = "Wood";
        chair1.color = "Brown";
        chair1.legs = 4;
        chair1.hasWheels = false;
        chair1.comfortLevel = "Firm";
        chair1.getInfo();

        Chair chair2 = new Chair("Metal", "Black", 5);
        chair2.hasWheels = true;
        chair2.comfortLevel = "High";
        chair2.getInfo();

        Chair chair3 = new Chair(false, "Medium", "Plastic");
        chair3.color = "White";
        chair3.legs = 4;
        chair3.getInfo();

        Chair chair4 = new Chair("Grey", 4, true);
        chair4.material = "Fabric";
        chair4.comfortLevel = "Plush";
        chair4.getInfo();

        Chair chair5 = new Chair();
        chair5.material = "Leather";
        chair5.color = "Cream";
        chair5.legs = 4;
        chair5.hasWheels = false;
        chair5.comfortLevel = "Soft";
        chair5.getInfo();
    }
}
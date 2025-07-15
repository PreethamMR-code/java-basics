class RadioRunner {
    public static void main(String[] args) {
        boolean result = Radio.registerRadio("Boat", "RockerzTune 300", "88-108 MHz", true, 15, "Red");

        System.out.println("Radio Registered: " + result);

        if (result) {
            Radio.getRadioDetails();
        }
    }
}

class SwiggyRunner {
    public static void main(String[] args) {
        boolean result = Swiggy.createSwiggy("Swiggy", "Sriharsha Majety", 2014, "Bengaluru, India", true, 300000);

        System.out.println("Swiggy Created: " + result);

        if (result) {
            Swiggy.readSwiggy();
        }
    }
}
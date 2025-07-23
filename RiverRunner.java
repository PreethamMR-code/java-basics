class RiverRunner {
    public static void main(String[] args) {
        boolean result = River.registerRiver("Ganga", "Gangotri Glacier", 2525.0, "Uttarakhand, UP, Bihar, West Bengal", true, "Bay of Bengal");

        System.out.println("River Registered: " + result);

        if (result) {
            River.getRiverDetails();
        }
    }
}

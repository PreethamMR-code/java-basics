class BangaloreAreaName1 {

    // External Way 
    // static String area1 = "vijaya nagara";
    // static String area2 = "basaveshwara nagar";
    // static String[] BangaloreAreaNames = { area1, area2 };

    public static void main(String[] args) {
        System.out.println("main started");

        String area1 = "vijaya nagara";
        String area2 = "basaveshwara nagar";

        String[] BangaloreAreaNames = { area1, area2 };

        for (String area : BangaloreAreaNames) {
            System.out.println(area);
        }

        System.out.println("main ended");
    }
}

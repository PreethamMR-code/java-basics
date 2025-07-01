class Resort1 {

    // External Way 
    // static String r1 = "The Tamara Coorg";
    // static String r2 = "Coorg Wilderness Resort & Spa";
    // static String r3 = "Java Rain Resort (Chikmagalur)";
    // static String r4 = "The Serai Chikmagalur";
    // static String r5 = "Rosetta by Ferns (Sakleshpur)";
    // static String r6 = "Trivik Hotels & Resorts Chikmagalur";
    // static String r7 = "Taj Madikeri Resort & Spa, Coorg";
    // static String[] resorts = {r1, r2, r3, r4, r5, r6, r7};

    public static void main(String[] args) {
        System.out.println("main started");

        String r1 = "The Tamara Coorg";
        String r2 = "Coorg Wilderness Resort & Spa";
        String r3 = "Java Rain Resort (Chikmagalur)";
        String r4 = "The Serai Chikmagalur";
        String r5 = "Rosetta by Ferns (Sakleshpur)";
        String r6 = "Trivik Hotels & Resorts Chikmagalur";
        String r7 = "Taj Madikeri Resort & Spa, Coorg";

        String[] resorts = {r1, r2, r3, r4, r5, r6, r7};

        for (String resort : resorts) {
            System.out.println(resort);
        }

        System.out.println("main ended");
    }
}

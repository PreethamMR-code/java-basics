class Earth1 {

    // External Way 
    // static String continent1 = "asia";
    // static String continent2 = "australia";
    // static String continent3 = "south america";
    // static String continent4 = "north america";
    // static String continent5 = "antarctica";
    // static String continent6 = "africa";
    // static String continent7 = "europe";
    // static String[] earthContinents = {
    //     continent1, continent2, continent3, continent4,
    //     continent5, continent6, continent7  };

    public static void main(String[] args) {
        System.out.println("main started");

        String continent1 = "asia";
        String continent2 = "australia";
        String continent3 = "south america";
        String continent4 = "north america";
        String continent5 = "antarctica";
        String continent6 = "africa";
        String continent7 = "europe";

        String[] earthContinents = {
            continent1, continent2, continent3,
            continent4, continent5, continent6, continent7
        };

        for (String continent : earthContinents) {
            System.out.println(continent);
        }

        System.out.println("main ended");
    }
}

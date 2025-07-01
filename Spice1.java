class Spice1 {

    // External Way 
    // static String s1 = "turmeric powder";
    // static String s2 = "chilli powder";
    // static String s3 = "cumin seeds";
    // static String s4 = "coriander powder";
    // static String s5 = "cardamom pods";
    // static String s6 = "cloves";
    // static String s7 = "cinnamon sticks";
    // static String s8 = "black pepper";
    // static String s9 = "bay leaves";
    // static String s10 = "mustard seeds";
    // static String s11 = "garam masala";
    // static String s12 = "fenugreek seeds";
    // static String s13 = "star anise";
    // static String s14 = "nutmeg";
    // static String[] spiceShop = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14};

    public static void main(String[] args) {
        System.out.println("main started");

        String s1 = "turmeric powder";
        String s2 = "chilli powder";
        String s3 = "cumin seeds";
        String s4 = "coriander powder";
        String s5 = "cardamom pods";
        String s6 = "cloves";
        String s7 = "cinnamon sticks";
        String s8 = "black pepper";
        String s9 = "bay leaves";
        String s10 = "mustard seeds";
        String s11 = "garam masala";
        String s12 = "fenugreek seeds";
        String s13 = "star anise";
        String s14 = "nutmeg";

        String[] spiceShop = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14};

        for (String spice : spiceShop) {
            System.out.println(spice);
        }

        System.out.println("main ended");
    }
}

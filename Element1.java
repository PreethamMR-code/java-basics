class Element1 {

    // External Way 
    // static String element1 = "Hydrogen";
    // static String element2 = "Helium";
    // static String element3 = "Lithium";
    // static String element4 = "Beryllium";
    // static String element5 = "Boron";
    // static String element6 = "Carbon";
    // static String element7 = "Nitrogen";
    // static String element8 = "Oxygen";
    // static String element9 = "Flurine";
    // static String element10 = "Neon";
    // static String element11 = "Sodium";
    // static String element12 = "Magnesium";
    // static String[] elements = {element1, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11, element12};

    public static void main(String[] args) {
        System.out.println("main started");

        String element1 = "Hydrogen";
        String element2 = "Helium";
        String element3 = "Lithium";
        String element4 = "Beryllium";
        String element5 = "Boron";
        String element6 = "Carbon";
        String element7 = "Nitrogen";
        String element8 = "Oxygen";
        String element9 = "Flurine";
        String element10 = "Neon";
        String element11 = "Sodium";
        String element12 = "Magnesium";

        String[] elements = {
            element1, element2, element3, element4, element5, element6,
            element7, element8, element9, element10, element11, element12
        };

        for (String element : elements) {
            System.out.println(element);
        }

        System.out.println("main ended");
    }
}

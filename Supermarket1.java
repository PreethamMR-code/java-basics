class Supermarket1 {

    // External Way 
    // static String i1 = "Ruby Red Velvet";
    // static String i2 = "Choco Peanut Fudge";
    // static String i3 = "Nutty Choco Caramel";
    // static String i4 = "Fruit Burst";
    // static String i5 = "Chocolate Crush";
    // static String i6 = "Fruity Mango Tango";
    // static String i7 = "Cookie Shot";
    // static String i8 = "Berry Crunch";
    // static String i9 = "Butterscotch Bananza";
    // static String i10 = "Brownie Fudge";
    // static String[] superMarketIceCreams = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};

    public static void main(String[] args) {
        System.out.println("main started");

        String i1 = "Ruby Red Velvet";
        String i2 = "Choco Peanut Fudge";
        String i3 = "Nutty Choco Caramel";
        String i4 = "Fruit Burst";
        String i5 = "Chocolate Crush";
        String i6 = "Fruity Mango Tango";
        String i7 = "Cookie Shot";
        String i8 = "Berry Crunch";
        String i9 = "Butterscotch Bananza";
        String i10 = "Brownie Fudge";

        String[] superMarketIceCreams = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};

        for (String iceCream : superMarketIceCreams) {
            System.out.println(iceCream);
        }

        System.out.println("main ended");
    }
}

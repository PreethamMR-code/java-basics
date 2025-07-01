class Juice1 {

    // External Way 
    // static String item1 = "lassi";
    // static String item2 = "grape juice";
    // static String item3 = "lemon juice";
    // static String item4 = "soda";
    // static String item5 = "mojito";
    // static String item6 = "apple juice";
    // static String item7 = "orange juice";
    // static String item8 = "pomegranate juice";
    // static String item9 = "musk melon";
    // static String item10 = "papaya juice";
    // static String item11 = "pineapple juice";
    // static String item12 = "mosambi";
    // static String item13 = "mango juice";
    // static String item14 = "water melon juice";
    // static String item15 = "sugar cane juice";
    // static String[] juiceShop = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10,
    //                               item11, item12, item13, item14, item15};

    public static void main(String[] args) {
        System.out.println("main started");

        String item1 = "lassi";
        String item2 = "grape juice";
        String item3 = "lemon juice";
        String item4 = "soda";
        String item5 = "mojito";
        String item6 = "apple juice";
        String item7 = "orange juice";
        String item8 = "pomegranate juice";
        String item9 = "musk melon";
        String item10 = "papaya juice";
        String item11 = "pineapple juice";
        String item12 = "mosambi";
        String item13 = "mango juice";
        String item14 = "water melon juice";
        String item15 = "sugar cane juice";

        String[] juiceShop = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10,
                              item11, item12, item13, item14, item15};

        for (String juice : juiceShop) {
            System.out.println(juice);
        }

        System.out.println("main ended");
    }
}

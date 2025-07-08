class juice {

    public static void displayJuiceMenu() {
        String[] juiceShop = {
            "lassi", "grape juice", "lemon juice", "soda", "mojito",
            "apple juice", "orange juice", "pomegranate juice", "musk melon",
            "papaya juice", "pineapple juice", "mosambi", "mango juice",
            "water melon juice", "sugar cane juice"
        };

        for (String juice : juiceShop) {
            System.out.println(juice);
        }
    }

    public static void main(String[] args) {
        displayJuiceMenu();
    }
}

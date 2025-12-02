class Chef {
    public static void prepareFood(String foodItem) {
        System.out.println("Preparing " + foodItem);

        Packer.pack(foodItem);

        System.out.println(foodItem + " prepared");
    }
}
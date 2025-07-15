class Packer {
    public static void pack(String foodItem) {
        System.out.println("Packing " + foodItem);

        DeliveryPerson.pickup();

        System.out.println(foodItem + " packed");
    }
}
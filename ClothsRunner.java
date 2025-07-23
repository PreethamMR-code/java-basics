class ClothsRunner {
    public static void main(String[] args) {
        boolean result = Cloths.registerCloth("T-Shirt", "Cotton", "Nike", "Navy Blue", "L", 119);

        System.out.println("Cloth Registered: " + result);

        if (result) {
            Cloths.getClothDetails();
        }
    }
}

class element {

    public static void displayElements() {
        String[] elements = {
            "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron",
            "Carbon", "Nitrogen", "Oxygen", "Flurine", "Neon",
            "Sodium", "Magnesium"
        };

        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        displayElements();
    }
}

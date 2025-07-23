class TyreRunner {
    public static void main(String[] args) {
        boolean result = Tyre.registerTyre("MRF", "Tubeless", 17, true, "All-Terrain", 4200.0);

        System.out.println("Tyre Registered: " + result);

        if (result) {
            Tyre.getTyreDetails();
        }
    }
}

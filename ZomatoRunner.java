class ZomatoRunner {
    public static void main(String[] args) {
        boolean result = Zomato.createZomato("Zomato", "Deepinder Goyal", 2008, "Gurugram, India", true, 250000);

        System.out.println("Zomato Created: " + result);

        if (result) {
            Zomato.readZomato();
        }
    }
}

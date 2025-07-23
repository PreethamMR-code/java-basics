class GamingPcRunner {
    public static void main(String[] args) {
        boolean result = GamingPc.registerGamingPc("Alienware", "Intel i9-13900K", "NVIDIA RTX 4090", 64, 2000, 349999.0);

        System.out.println("Gaming PC Registered: " + result);

        if (result) {
            GamingPc.getGamingPcDetails();
        }
    }
}

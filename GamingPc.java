class GamingPc {
    static String brand;
    static String processor;
    static String graphicsCard;
    static int ramInGB;
    static int storageInGB;
    static double price;

    public static boolean registerGamingPc(String pcBrand, String cpu, String gpu, int ram, int storage, double cost) {
        boolean isPcRegistered = false;

        boolean brandOk = false;
        boolean processorOk = false;
        boolean gpuOk = false;
        boolean ramOk = false;
        boolean storageOk = false;
        boolean priceOk = false;

        if (pcBrand != null && !pcBrand.isEmpty()) {
            brand = pcBrand;
            brandOk = true;
        } else {
            System.out.println("Brand is required.");
        }

        if (cpu != null && !cpu.isEmpty()) {
            processor = cpu;
            processorOk = true;
        } else {
            System.out.println("Processor info is missing.");
        }

        if (gpu != null && !gpu.isEmpty()) {
            graphicsCard = gpu;
            gpuOk = true;
        } else {
            System.out.println("Graphics card must be specified.");
        }

        if (ram > 0) {
            ramInGB = ram;
            ramOk = true;
        } else {
            System.out.println("RAM should be greater than 0 GB.");
        }

        if (storage > 0) {
            storageInGB = storage;
            storageOk = true;
        } else {
            System.out.println("Storage must be greater than 0 GB.");
        }

        if (cost > 0) {
            price = cost;
            priceOk = true;
        } else {
            System.out.println("Price must be a positive number.");
        }

        if (brandOk && processorOk && gpuOk && ramOk && storageOk && priceOk) {
            isPcRegistered = true;
        } else {
            System.out.println("Gaming PC registration failed.");
        }

        return isPcRegistered;
    }

    public static void getGamingPcDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("RAM: " + ramInGB + " GB");
        System.out.println("Storage: " + storageInGB + " GB");
        System.out.println("Price: ₹" + price);
    }
}

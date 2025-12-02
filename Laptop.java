class Laptop {
    String brand;
    String model;
    double screenSizeInches;
    int ramGB;
    String processor;

    Laptop() {
        System.out.println("Laptop constructor invoked");
    }

    Laptop(String brand, String model, double screenSizeInches) {
        System.out.println("Laptop parameterized constructor (brand, model, screenSize) invoked");
        this.brand = brand;
        this.model = model;
        this.screenSizeInches = screenSizeInches;
    }

    Laptop(int ramGB, String processor, String brand) {
        System.out.println("Laptop parameterized constructor (ram, processor, brand) invoked");
        this.ramGB = ramGB;
        this.processor = processor;
        this.brand = brand;
    }

    Laptop(String model, int ramGB, String processor) {
        System.out.println("Laptop parameterized constructor (model, ram, processor) invoked");
        this.model = model;
        this.ramGB = ramGB;
        this.processor = processor;
    }

    public void getInfo() {
        System.out.println("\n--- Laptop Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInches + " inches");
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Processor: " + processor);
    }
}


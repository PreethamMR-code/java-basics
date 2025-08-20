class Television {
    String brand;
    double screenSizeInches;
    String resolution;
    boolean isSmartTV;
    String displayType;

    Television() {
        System.out.println("Television constructor invoked");
    }

    Television(String brand, double screenSizeInches, String resolution) {
        System.out.println("Television parameterized constructor (brand, size, resolution) invoked");
        this.brand = brand;
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
    }

    Television(boolean isSmartTV, String displayType, String brand) {
        System.out.println("Television parameterized constructor (smart, displayType, brand) invoked");
        this.isSmartTV = isSmartTV;
        this.displayType = displayType;
        this.brand = brand;
    }

    Television(String resolution, String displayType, double screenSizeInches) {
        System.out.println("Television parameterized constructor (resolution, displayType, size) invoked");
        this.resolution = resolution;
        this.displayType = displayType;
        this.screenSizeInches = screenSizeInches;
    }

    public void getInfo() {
        System.out.println("\n--- Television Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSizeInches + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Is Smart TV: " + isSmartTV);
        System.out.println("Display Type: " + displayType);
    }
}


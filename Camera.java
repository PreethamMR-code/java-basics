class Camera {
    String brand;
    String type;
    int megapixels;
    boolean hasZoomLens;
    String storageType;

    Camera() {
        System.out.println("Camera constructor invoked");
    }

    Camera(String brand, String type, int megapixels) {
        System.out.println("Camera parameterized constructor (brand, type, megapixels) invoked");
        this.brand = brand;
        this.type = type;
        this.megapixels = megapixels;
    }

    Camera(boolean hasZoomLens, String storageType, String brand) {
        System.out.println("Camera parameterized constructor (zoom, storage, brand) invoked");
        this.hasZoomLens = hasZoomLens;
        this.storageType = storageType;
        this.brand = brand;
    }

    Camera(String type, String storageType, boolean hasZoomLens) {
        System.out.println("Camera parameterized constructor (type, storage, zoom) invoked");
        this.type = type;
        this.storageType = storageType;
        this.hasZoomLens = hasZoomLens;
    }

    public void getInfo() {
        System.out.println("\n--- Camera Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Megapixels: " + megapixels);
        System.out.println("Has Zoom Lens: " + hasZoomLens);
        System.out.println("Storage Type: " + storageType);
    }
}


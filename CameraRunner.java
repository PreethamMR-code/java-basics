class CameraRunner {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.brand = "Canon";
        cam1.type = "DSLR";
        cam1.megapixels = 24;
        cam1.hasZoomLens = true;
        cam1.storageType = "SD Card";
        cam1.getInfo();

        Camera cam2 = new Camera("Sony", "Mirrorless", 42);
        cam2.hasZoomLens = true;
        cam2.storageType = "CFexpress";
        cam2.getInfo();

        Camera cam3 = new Camera(false, "Internal", "GoPro");
        cam3.type = "Action";
        cam3.megapixels = 12;
        cam3.getInfo();

        Camera cam4 = new Camera("Point-and-Shoot", "SD Card", false);
        cam4.brand = "Nikon";
        cam4.megapixels = 20;
        cam4.getInfo();

        Camera cam5 = new Camera();
        cam5.brand = "Fujifilm";
        cam5.type = "Instant";
        cam5.megapixels = 0; // Instant cameras don't typically list megapixels
        cam5.hasZoomLens = false;
        cam5.storageType = "Film Pack";
        cam5.getInfo();
    }
}
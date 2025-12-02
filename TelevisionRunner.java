class TelevisionRunner {
    public static void main(String[] args) {
		
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.screenSizeInches = 55.0;
        tv1.resolution = "4K UHD";
        tv1.isSmartTV = true;
        tv1.displayType = "LED";
        tv1.getInfo();

        Television tv2 = new Television("LG", 65.0, "8K UHD");
        tv2.isSmartTV = true;
        tv2.displayType = "OLED";
        tv2.getInfo();

        Television tv3 = new Television(false, "LCD", "Sony");
        tv3.screenSizeInches = 40.0;
        tv3.resolution = "1080p Full HD";
        tv3.getInfo();

        Television tv4 = new Television("4K UHD", "QLED", 75.0);
        tv4.brand = "TCL";
        tv4.isSmartTV = true;
        tv4.getInfo();

        Television tv5 = new Television();
        tv5.brand = "Panasonic";
        tv5.screenSizeInches = 32.0;
        tv5.resolution = "720p HD";
        tv5.isSmartTV = false;
        tv5.displayType = "LED";
        tv5.getInfo();
    }
}
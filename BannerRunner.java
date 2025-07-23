class BannerRunner {
    public static void main(String[] args) {
        boolean result = Banner.registerBanner("Mega Sale - 50% OFF!", "Yellow", "Arial Bold", 800, 200, true);

        System.out.println("Banner Registered: " + result);

        if (result) {
            Banner.getBannerDetails();
        }
    }
}

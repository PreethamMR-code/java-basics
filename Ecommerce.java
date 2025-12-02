class Ecommerce {
    String platformName;
    String CEO;
    int activeUsersMillions;

    Category category;

    Ecommerce() {
        this.platformName = "ShopKart";
        this.CEO = "Amit Patel";
        this.activeUsersMillions = 50;
    }

    void getEcommerceInfo() {
        System.out.println("-------Ecommerce Details-------");
        System.out.println("Platform Name: " + platformName);
        System.out.println("CEO: " + CEO);
        System.out.println("Active Users: " + activeUsersMillions + " Million");

        this.category.getCategoryInfo();
    }
}

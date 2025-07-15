class InstagramRunner {
    public static void main(String[] args) {
        boolean result = Instagram.createInstagram("Instagram", "Kevin Systrom", 2010, "Meta", true, 1500000000);

        System.out.println("Instagram Created: " + result);

        if (result) {
            Instagram.readInstagram();
        }
    }
}

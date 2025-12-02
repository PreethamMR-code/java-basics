class EcommerceRunner {
    public static void main(String args[]) {
        Ecommerce ecommerce = new Ecommerce();
        Category category = new Category();
        Product product = new Product();

        ecommerce.category = category;
        category.product = product;

        ecommerce.getEcommerceInfo();
    }
}
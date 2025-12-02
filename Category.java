class Category {
    String categoryName;
    int numberOfProducts;
    String department;

    Product product;

    Category() {
        this.categoryName = "Electronics";
        this.numberOfProducts = 10000;
        this.department = "Gadgets";
    }

    void getCategoryInfo() {
        System.out.println("-------Category Details ------");
        System.out.println("Category Name: " + categoryName);
        System.out.println("Number of Products: " + numberOfProducts);
        System.out.println("Department: " + department);

        this.product.getProductInfo();
    }
}

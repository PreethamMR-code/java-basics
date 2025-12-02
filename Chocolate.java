class Chocolate {

    int chocolateId;
    String ingredients[];
    String chocolateName;
    String Brand;
    int price;

    Chocolate() {
        System.out.println("Default Chocolate constructor invoked");
    }

    Chocolate(int chocolateId, String chocolateName, int price) {
        System.out.println("Chocolate constructor with ID, Name, Price invoked");
        this.chocolateId = chocolateId;
        this.chocolateName = chocolateName;
        this.price = price;
    }

    Chocolate(String chocolateName, String Brand, String[] ingredients) {
        System.out.println("Chocolate constructor with Name, Brand, Ingredients invoked");
        this.chocolateName = chocolateName;
        this.Brand = Brand;
        this.ingredients = ingredients;
    }

    Chocolate(String Brand, int price, .int chocolateId) {
        System.out.println("Chocolate constructor with Brand, Price, ID invoked");
        this.Brand = Brand;
        this.price = price;
        this.chocolateId = chocolateId;
    }

    public void getChocolateDetails() {
        System.out.println("--------------------------------");
        System.out.println("Chocolate ID: " + chocolateId);
        System.out.println("Chocolate Name: " + chocolateName);
        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + price);

         
            System.out.println("The ingredients of " + chocolateName + " are:");
            for (String ingredient : ingredients) { 
                System.out.println(ingredient);
          
        
        
    }
}
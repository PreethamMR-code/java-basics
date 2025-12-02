class ChocolateRunner {

    public static void main(String a[]) {

        String[] ingredientsTemp1 = {"Sugar", "Cocoa Powder", "Almonds"};
        String[] ingredientsTemp2 = {"Milk", "Caramel", "Nougat"};
        String[] ingredientsTemp3 = {"Dark Chocolate", "Orange Peel"};
        String[] ingredientsTemp4 = {"White Chocolate", "Vanilla"};


     
        Chocolate chocolate1 = new Chocolate();
        chocolate1.chocolateId = 101;
        chocolate1.chocolateName = "Classic Bar";
        chocolate1.Brand = "ChocoCo";
        chocolate1.price = 50;
        chocolate1.ingredients = ingredientsTemp1;
        chocolate1.getChocolateDetails();


        
        Chocolate chocolate2 = new Chocolate(102, "Creamy Delight", 75);
        chocolate2.Brand = "SweetTreats";
        chocolate2.ingredients = ingredientsTemp2;
        chocolate2.getChocolateDetails();


      
        Chocolate chocolate3 = new Chocolate("Rich Dark", "Gourmet Chocolates", ingredientsTemp3);
        chocolate3.chocolateId = 103;
        chocolate3.price = 150;
        chocolate3.getChocolateDetails();


        
        Chocolate chocolate4 = new Chocolate("Velvet Dreams", 200, 104);
        chocolate4.chocolateName = "Luxury White";
        chocolate4.ingredients = ingredientsTemp4;
        chocolate4.getChocolateDetails();


      
        Chocolate chocolate5 = new Chocolate();
        chocolate5.chocolateId = 105;
        chocolate5.chocolateName = "Nutty Crunch";
        chocolate5.Brand = "CrunchyBites";
        chocolate5.price = 90;
        chocolate5.ingredients = new String[]{"Chocolate", "Peanuts", "Crisp Rice"};
        chocolate5.getChocolateDetails();
    }
}
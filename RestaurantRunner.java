class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant();
        r1.display();
        Restaurant r2 = new Restaurant("The Eatery");
        r2.display();
        Restaurant r3 = new Restaurant("Seafood Delight", "Seafood");
        r3.display();
        Restaurant r4 = new Restaurant("Pizza Corner", "Italian", "Uptown");
        r4.display();
        Restaurant r5 = new Restaurant("Sushi House", "Japanese", "Midtown", 5);
        r5.display();
        Restaurant r6 = new Restaurant("Burger Joint", "Fast Food", "Downtown", 3, false);
        r6.display();
        Restaurant r7 = new Restaurant("Veggie Delight", "Vegan", "Suburbs", 4, true, 15);
        r7.display();
    }
}
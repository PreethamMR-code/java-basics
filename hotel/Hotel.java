class Hotel {

    static String name = "The Grand Pavilion";
    static String location = "Bangalore, India";
    static int starRating = 5;
    static int totalRooms = 120;

    public static void getHotelDetails() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Star Rating: " + starRating + " Star");
        System.out.println("Total Rooms: " + totalRooms);
    

     System.out.println("\n=== Chef Details ===");
        Chef.chefInfo();
    }
}
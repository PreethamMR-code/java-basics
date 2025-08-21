class Restaurant {
    String name;
    String cuisine;
    String location;
    int rating;
    boolean isOpen;
    int numberOfTables;

    Restaurant() {
        this("Food Plaza", "Multi-cuisine", "Downtown", 4, true, 20);
    }
    Restaurant(String name) {
        this(name, "Multi-cuisine", "Downtown", 4, true, 20);
    }
    Restaurant(String name, String cuisine) {
        this(name, cuisine, "Downtown", 4, true, 20);
    }
    Restaurant(String name, String cuisine, String location) {
        this(name, cuisine, location, 4, true, 20);
    }
    Restaurant(String name, String cuisine, String location, int rating) {
        this(name, cuisine, location, rating, true, 20);
    }
    Restaurant(String name, String cuisine, String location, int rating, boolean isOpen) {
        this(name, cuisine, location, rating, isOpen, 20);
    }
    Restaurant(String name, String cuisine, String location, int rating, boolean isOpen, int numberOfTables) {
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating = rating;
        this.isOpen = isOpen;
        this.numberOfTables = numberOfTables;
    }
    void display() {
        System.out.println(name + " " + cuisine + " located at " + location + " rating: " + rating + " Open: " + isOpen + " Tables: " + numberOfTables);
    }
}



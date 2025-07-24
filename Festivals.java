public class Festivals {
    String name;
    String location;
    String date; 
    String type;
    String description;
    int duration; 

    public void getFestivalInfo() {
        System.out.println("\nFestival Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " days");
    }
}
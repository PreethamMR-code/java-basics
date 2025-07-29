public class Festivals {
    String name;
    String location;
    String date;
    String type;
    String description;
    int duration;

    Festivals(){
        System.out.println("Festivals constructor is invoked");
    }

    Festivals(String name, String location, String date, String type, String description, int duration){
        System.out.println("Festivals parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.date = date;
        this.type = type;
        this.description = description;
        this.duration = duration;
    }

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
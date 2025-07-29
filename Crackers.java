public class Crackers {
    String name;
    String type;
    double weight;
    String color;
    String soundLevel;
    int duration;

    Crackers(){
        System.out.println("Crackers constructor is invoked");
    }

    Crackers(String name, String type, double weight, String color, String soundLevel, int duration){
        System.out.println("Crackers parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.soundLevel = soundLevel;
        this.duration = duration;
    }

    public void getCrackersInfo() {
        System.out.println("\nCracker Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Color: " + color);
        System.out.println("Sound Level: " + soundLevel);
        System.out.println("Duration: " + duration + " seconds");
    }
}
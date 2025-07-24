public class Karate {
    String style;
    int level; 
    String beltLevel; 
    String belt; 
    String dojoName;
    String instructor;
    int experienceYears;
    String origin; 

    public void getKarateInfo() {
        System.out.println("\nKarate Details:");
        System.out.println("Style: " + style);
        System.out.println("Level: " + level);
        System.out.println("Belt Level: " + beltLevel);
        System.out.println("Belt Color: " + belt);
        System.out.println("Dojo Name: " + dojoName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Experience Years: " + experienceYears);
        System.out.println("Origin: " + origin);
    }
}
class Karate {
    String style;
    int level;
    String beltLevel;
    String belt;
    String dojoName;
    String instructor;
    int experienceYears;
    String origin;

    Karate(){
        System.out.println("Karate constructor is invoked");
    }

    Karate(String style, int level, String beltLevel, String belt, String dojoName, String instructor, int experienceYears, String origin){
        System.out.println("Karate parameterized constructor is invoked");
        this.style = style;
        this.level = level;
        this.beltLevel = beltLevel;
        this.belt = belt;
        this.dojoName = dojoName;
        this.instructor = instructor;
        this.experienceYears = experienceYears;
        this.origin = origin;
    }

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
lass King {
    String name;
    String dynasty;
    int reignYears;
    String kingdom;
    String spouse;
    String knownFor;

    King(){
        System.out.println("King constructor is invoked");
    }

    King(String name, String dynasty, int reignYears, String kingdom, String spouse, String knownFor){
        System.out.println("King parameterized constructor is invoked");
        this.name = name;
        this.dynasty = dynasty;
        this.reignYears = reignYears;
        this.kingdom = kingdom;
        this.spouse = spouse;
        this.knownFor = knownFor;
    }

    public void getKingInfo() {
        System.out.println("\nKing Details:");
        System.out.println("Name: " + name);
        System.out.println("Dynasty: " + dynasty);
        System.out.println("Reign Years: " + reignYears);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Spouse: " + spouse);
        System.out.println("Known For: " + knownFor);
    }
}
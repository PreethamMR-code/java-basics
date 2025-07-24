public class King {
    String name;
    String dynasty;
    int reignYears;
    String kingdom;
    String spouse;
    String knownFor;

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
public class Casino {
    String name;
    String location;
    int numberOfGames;
    String owner;
    String licenseNumber;
    int slots;
    boolean vipRoom;

    Casino(){
        System.out.println("Casino constructor is invoked");
    }

    Casino(String name, String location, int numberOfGames, String owner, String licenseNumber, int slots, boolean vipRoom){
        System.out.println("Casino parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.numberOfGames = numberOfGames;
        this.owner = owner;
        this.licenseNumber = licenseNumber;
        this.slots = slots;
        this.vipRoom = vipRoom;
    }

    public void getCasinoInfo()
    {
        System.out.println("\nCasino Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Owner: " + owner);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Slots: " + slots);
        System.out.println("VIP Room: " + vipRoom);
    }
}
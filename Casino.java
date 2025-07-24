public class Casino {
    String name;
    String location;
    int numberOfGames;
    String owner;
    String licenseNumber;
    int slots;
    boolean vipRoom;
	
	public void getCasinoInfo()
	{
	
	System.out.println("\nCasino Details:");
		System.out.println("name :" +name);
		System.out.println("location :" +location);
		System.out.println("numberOfGames :" +numberOfGames);
		System.out.println("owner :" +owner);
		System.out.println("licenseNumber :" +licenseNumber);
		System.out.println("slots :" +slots);
		System.out.println("vipRoom :" +vipRoom);
		
		
	}
}

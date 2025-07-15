class Garage{

	static String name = "Detailing Mafia";
	static String owner = "Brad Pitt";
	static String city = "Bengaluru";
	
	public static void getGarageDetails()
	{
	
	System.out.println("===GArage Details===");
	System.out.println("Garage Name:" + name);
	System.out.println("Owner Name:" + owner);
	System.out.println("City:" + city);
	
	System.out.println("\n===mechanic Detils===");
	Mechanic.displayMechanic();
	
	}
}
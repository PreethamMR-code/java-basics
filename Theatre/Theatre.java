class Theatre {

	static String name = "Cineplex Max";
	static String location = "Lulu Mall";
	static int screens = 5;
	static boolean is3DEnabled = true;
	
	public static void getTheatreDetails()
	{
		System.out.println("===Theatre Details===");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("Screens:" + screens);
		System.out.println("3D Enabled:" + is3DEnabled);
		
		System.out.println("\n===Actor Details===");
		Actor.actorInfo();
	}

}
class Hospital {

    static String name = "Apollo Hospital";
    static int totalBeds = 200;
    static boolean emergencyAvailable = true;

    public static void getHospitalDetails() 
	{
        System.out.println("=== Hospital Details ===");
        System.out.println("Name: " + name);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Emergency Service: " + emergencyAvailable);

        System.out.println("\n=== Doctor Details ===");
        Doctor.doctorInfo();
    }
}



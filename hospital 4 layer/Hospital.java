class Hospital{
public static void checkUp(String patientName, int age, long phoneNumber, String email, String diseases)
{
	System.out.println("check up started");
	
	Doctor.treatment(patientName, age, diseases);
	
	System.out.println("check up done");
}

}
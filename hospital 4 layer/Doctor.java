class Doctor{

	public static void treatment(String patientName, int age, String diseases)
	{
		System.out.println("treatment started");
		
		Nurse.assist(patientName);
		
		System.out.println("treatment ended");
	}
}
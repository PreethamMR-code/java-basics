class HospitalRunner{
	
		static String name = "Sharma";
		static int age = 30;
		static long phoneNumber = 9865321478L;
		static String email = "sharma@gmail.com";
		static String diseases = "cold";

	public static void main(String Apollo [])
	{
		
		
		System.out.println("Patient Name is:" + name);
		System.out.println("PAtient age:" + age);
		System.out.println("Patient phone number:" + phoneNumber);
		System.out.println("Email address:" + email);
		System.out.println("disease is:" + diseases);
		
		Hospital.checkUp(name, age, phoneNumber, email, diseases);
	}
}
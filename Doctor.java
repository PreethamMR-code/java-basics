class Doctor{

	String doctorName;
	int age;
	boolean doctorAvailable;


	Doctor(){
	
		this.doctorName = "dr. Preetham";
		this.age = 25;
		this.doctorAvailable = true;
		
	
	}
	
	void getDoctorInfo(){
	
		System.out.println("-----doctor details------");
		System.out.println(" doctor name is :"+doctorName);
		System.out.println(" doctor age is : "+age);
		System.out.println("does the doctor available:" + doctorAvailable);
	}
	
}
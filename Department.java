class Department{

	String departmentName;   
	int noOfDoctors;
	int noOfBeds;
	String conditionsTreated;
	
	Doctor doctor;
	
	
	Department(){
	
		this.departmentName= "Physiotherapy";
		this.noOfDoctors = 50;
		this.noOfBeds = 20;
		this.conditionsTreated = "spinal pain, joint pain";
	}
	
	
	void getDepartmentInfo(){
	
		System.out.println("-------Department Details ------");
		
		System.out.println("Department Name is :" + departmentName);
		System.out.println("Number of doctors are:" + noOfDoctors);
		System.out.println(" number of beds are:" + noOfBeds);
		System.out.println("Conditions treated are:" +conditionsTreated);
	
	
		this.doctor.getDoctorInfo();
	}
}
class HospitalRunner{

	public static void main(String args[]){
	
		Hospital hospital = new Hospital();
		
		Department department = new Department();
		
		Doctor doctor = new Doctor();
		
		hospital.department=department;
		department.doctor= doctor;
		
		
		hospital.getHospitalInfo();
		
	}

}
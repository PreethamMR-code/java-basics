class Hospital{

	String hospitalName;
	String address;
	int noOfFloors;
	
	
	Department department;
	
	
	Hospital(){
		this.hospitalName = "Victoria Hospital";
		this.address = "City Market in Kalasipalya";
		this.noOfFloors = 5;
		
	
	}

	
		void getHospitalInfo(){
		
			System.out.println("-------Hospital Details-------");
			System.out.println("Hospital name is:"+hospitalName);
			System.out.println("Hospital name is:"+address);
			System.out.println("Hospital name is:"+noOfFloors);
			
			
		this.department.getDepartmentInfo();	
			
		}


}
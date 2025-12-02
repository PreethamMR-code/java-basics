class AmusementPark {
	
	AmusementPark(){
		System.out.println("Amusement park constructor is invoked");
	}
	
	AmusementPark(String name, String location, String openingHours,int numberOfRides, double entryFee ){
		System.out.println("Amusement park  parameterized constructor is invoked");
		this.name = name;
		this.location = location;
		this.openingHours = openingHours;
		this.numberOfRides = numberOfRides;
		this.entryFee = entryFee;
	}
	
    String name;
    String location;
    String openingHours;
    int numberOfRides;
    double entryFee;
	
	public void getApInfo()
	{
		System.out.println("name :" +name);
		System.out.println("location :" +location);
		System.out.println("openingHours :" +openingHours);
		System.out.println("numberOfRides :" +numberOfRides);
		System.out.println("entryFee :" +entryFee);
		
	}
}
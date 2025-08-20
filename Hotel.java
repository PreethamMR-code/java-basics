class Hotel{

	String hotelName;
	String ownerName;
	int noOfWorkers;
	
	Floor floor;             //custom  obj ref
	
	
	
	//Floor floor= new Floor();          // creates another object  or duplicate object
	
	
	Hotel(){
		/*this.hotelName = "taj1";
		this.ownerName = "tata1";
		*/
	}
	
	
	public void getHotelInfo(){
	
		System.out.println("------Hotel info is fetched----");
		System.out.println("hotel name is :" + hotelName);
		System.out.println("hotel owner is :" + ownerName);
		
		this.floor.getFloorInfo();
	}

}
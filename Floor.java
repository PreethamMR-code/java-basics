class Floor{

	 int noOfRooms;
	 
	Room room;
	 
	 //Room room = new Room();
	 
	 
	 Floor(){
		 
	 }
	 
	 
	 public void getFloorInfo(){
	 
		System.out.println("-----Floor info is fetched----");
		
		System.out.println("no of rooms:"+noOfRooms);
		
		
		
		this.room.getRoomInfo();
	 }
}
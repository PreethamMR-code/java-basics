class HotelRunner{

	public static void main(String taj[]){
	
	Hotel hotel = new Hotel();
	
		String ownerName = "tata";
		hotel.ownerName = ownerName;
	
		String hotelName = "taj";
		hotel.hotelName = hotelName;
	
	
	Floor floor = new Floor();
	
		int noOfRooms = 100;
		floor.noOfRooms=noOfRooms;
		//System.out.println(hotel.floor);      //null
	
	
		//System.out.println("hotel:"+hotel.floor.room);    //null pointer exception
	
		hotel.floor = floor;
	
	
	Room room = new Room();
	
		String bedType = "king Size";
		room.bedType=bedType;
		boolean minibarAvailable= true;
		room.minibarAvailable=minibarAvailable;
	
		floor.room = room;
	
	
	hotel.getHotelInfo();
	
	
	}
}
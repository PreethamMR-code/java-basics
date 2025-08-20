class Room{

	String bedType;
	boolean minibarAvailable;
	
	Room(){
		
	}
	
	public void getRoomInfo(){
	
		System.out.println("----Room info fetched-----");
		
		System.out.println("bed type:"+bedType);
		System.out.println("is minibarAvailable:"+minibarAvailable);
	}
}
class VehicleRunner{
	
	public static void main(String args[]){
		
		boolean vehicle=Vehicle.registerVehicle("KA 25 J 8565","mallikarjun");
		System.out.println("is vehicle is registered:"+vehicle);
		
		Vehicle.displayVehicle();
		
		
	}
	
	
}
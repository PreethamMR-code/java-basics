class RemoteRunner{

	public static void main(String args[]){
	
		Remote r1 = new Remote();
		r1.brand = "samsung";
		r1.remoteSizeInches= 10.5;
		r1.noOfButtons = 50;
		r1.isSmartTvRemote = true;
		r1.getInfo();
		
		
		Remote r2 = new Remote("sony", 10.00, 60);
		r2.isSmartTvRemote = false;
		r2.getInfo();
	}

}
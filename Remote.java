class  Remote{

	String brand;
    double remoteSizeInches;
    int noOfButtons;
    boolean isSmartTvRemote;
    
	
	Remote(){
			System.out.println("Remote constructor invoked");
		}
	
	 Remote(String brand, double remoteSizeInches, int noOfButtons) {
        System.out.println("Remote parameterized constructor (brand, size, noOfButtons) invoked");
        this.brand = brand;
        this.remoteSizeInches = remoteSizeInches;
        this.noOfButtons = noOfButtons;
    }
	
	Remote(boolean isSmartTvRemote, String brand) {
        System.out.println("Remote parameterized constructor (smart, brand) invoked");
        this.isSmartTvRemote = isSmartTvRemote;
        this.brand = brand;
    }

	Remote(String brand, boolean isSmartTvRemote){
		System.out.println("Remote parameterized constructor(brand, isSmartTvRemote) invoked");
		this.brand = brand;
		this.isSmartTvRemote = isSmartTvRemote;
	}

	
	public void getInfo(){
	
	System.out.println("-----Remote Details-----");
	System.out.println("brand name:" + brand);
	System.out.println("remote size in inch:" + remoteSizeInches);
	System.out.println("number of buttons:"+noOfButtons);
	System.out.println("is it smart tv remote:"+isSmartTvRemote);
	}
}
class PassportSevaRunner{

	public static void main(String seva[]){
	
	boolean userIsRegistered = PassportSeva.registerUser("baba","das","baba@17","baba@17");
	
	System.out.println("is the user registered:" + userIsRegistered);
	
	
	if(userIsRegistered)
		PassportSeva.getUserInfo();
		
	}
}



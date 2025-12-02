class PassportSeva{
	
	static String givenName;
	static String surName;
	static String password;
	static String confirmPassword;
	
	public static boolean registerUser(String gName,String sName,String pwd,String cpwd){
		
		boolean isUserRegistered=false;
		
		//boolean givenNameValid=false;
		//boolean surNameValid=false;
		//boolean passwordValid=false;
		//boolean confirmPasswordValid=false;
		
		boolean userValidated = validatePassportUser(String gName,String sName,String pwd,String cpwd)
		{
			boolean isUserRegistered = false;
			
			boolean userValidated = true;
		}
		
		
		
		
		return isUserRegistered;
		
	}
	
	public static void getUserInfo(){
		
		confirmPassword = validatePassportUser.confirmPassword;
		
		System.out.println("the given name is:"+ givenName);
		System.out.println("the sur name is:"+ surName);
		System.out.println("the given password is:"+ password);
		System.out.println("the confirm password is:"+ confirmPassword);
		

		
	}
	
	
	public static boolean validatePassportUser(String gName, String sName, String pwd, String cPwd){
		
		
		boolean givenNameValid=false;
		boolean surNameValid=false;
		boolean passwordValid=false;
		boolean confirmPasswordValid=false;
		
		if(gName!=null){
			
			givenName=gName;
			givenNameValid=true;
		}else{
			
			System.out.println("give valid user name");
		}
		
		if(sName!=null){
			
			surName=sName;
			surNameValid=true;
			
		}else{
			
			System.out.println("give valid sur name");
		}
		
		
		
		if(pwd!=null){
			password=pwd;
			passwordValid=true;
			
		}
		if(cpwd!=null){
			confirmPassword=cpwd;
			confirmPasswordValid=true;
			
		}
		if(givenNameValid==true && surNameValid==true && passwordValid==true && confirmPasswordValid==true){
			
			isUserRegistered=true;
		}
		return isUserRegistered;
	}
}
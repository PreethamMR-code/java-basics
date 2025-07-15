class StudentPortalRunner{
	
	public static void main(String args[]){
		
		boolean userValid=StudentPortal.loginStudent("sagar","09/04/2002");
		System.out.println("is student is valid :"+userValid);

		StudentPortal.displayStudentInfo();
		
	}
	
}
class StudentRunner{
	
	public static void main(String args[]){
		
		boolean student=Student.registerStudent("Darshan",22);
		System.out.println("is student is valid:"+student);
		
		Student.displayStudent();
		
		
	}
	
	
}
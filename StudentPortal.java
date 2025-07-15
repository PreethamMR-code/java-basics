class StudentPortal{
    static String studentID;
    static String dob;

    public static boolean loginStudent(String id,String dateOfBirth) {
		
		boolean isUserValid=false;
		boolean stuId=false;
		boolean dobirth=false;
		
        if (id!=null){
            studentID = id;
            stuId=true;
        }
		
		if(dateOfBirth!=null){
			dob=dateOfBirth;
			dobirth=true;
		}
		
		if(stuId==true && dobirth==true){
			
			isUserValid=true;
			
		}
        return isUserValid;
    }

    public static void displayStudentInfo(){
        System.out.println("student ID: "+stuId);
        System.out.println("date of Birth: "+dob);
    }
}


class Student{
    static String name;
    static int age;

    public static boolean registerStudent(String studentName, int  studentAge) {
        boolean isNameValid=false;
        boolean isAgeValid=false;
        boolean isRegistered=false;

        if(studentName != null) {
            name=studentName;
            isNameValid=true;
        }

        if(studentAge!=0) {
            age=studentAge;
            isAgeValid=true;
        }

        if(isNameValid==true) {
            isRegistered=true;
        }

        return isRegistered;
    }

    public static void displayStudent(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }
}

class College {

    static String name = "Presidency College";
    static String location = "Bengaluru";
    static int departments = 12;

    public static void getCollegeDetails() 
	{
        System.out.println("=== College Details ===");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Departments: " + departments);

        System.out.println("\n=== Professor Details ===");
        Professor.professorInfo();
    }
}



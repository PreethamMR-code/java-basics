class Court {
    
       static  String name ;
    static    String type ; 
    static    String location ;
     static   int judgesCount ;
     static   int pendingCases ;
     static   int solvedCases ;
     static   String chiefJudge ;
     static   boolean eFilingAvailable ;
     static   boolean onlineStatusCheck;
     static   int staffCount ;
    static    String workingHours ;
    static    boolean legalAidAvailable ;
    static    int courtRooms ;
     static   boolean hasLibrary ;
     static   boolean CCTV ;
    static    String contactEmail ; 
    static    String contactNumber ; 
    static    String jurisdiction ;
    static    String barAssociationName ;
     static   boolean mediationAvailable ;
	 
	 public static void main(String[] args) 
	{

        System.out.println("Court Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Judges Count: " + judgesCount);
        System.out.println("Pending Cases: " + pendingCases);
        System.out.println("Solved Cases: " + solvedCases);
        System.out.println("Chief Judge: " + chiefJudge);
        System.out.println("E-Filing Available: " + eFilingAvailable);
        System.out.println("Online Status Check: " + onlineStatusCheck);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Legal Aid Available: " + legalAidAvailable);
        System.out.println("Court Rooms: " + courtRooms);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("CCTV: " + CCTV);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Bar Association Name: " + barAssociationName);
        System.out.println("Mediation Available: " + mediationAvailable);
		
		String name = "Karnataka High Court";
        String type = "High"; 
        String location = "Bengaluru, Karnataka, India";
        int judgesCount = 62;
        int pendingCases = 250000;
        int solvedCases = 180000;
        String chiefJudge = "Hon'ble Mr. Justice N.V. Anjaria";
        boolean eFilingAvailable = true;
        boolean onlineStatusCheck = true;
        int staffCount = 1500;
        String workingHours = "10:30 AM - 04:30 PM";
        boolean legalAidAvailable = true;
        int courtRooms = 50;
        boolean hasLibrary = true;
        boolean CCTV = true;
        String contactEmail = "karnatakahc.nic.in@nic.in"; 
        String contactNumber = "080-22946222"; 
        String jurisdiction = "State of Karnataka";
        String barAssociationName = "Karnataka High Court Bar Association";
        boolean mediationAvailable = true;
		
		
		 System.out.println("Court Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Judges Count: " + judgesCount);
        System.out.println("Pending Cases: " + pendingCases);
        System.out.println("Solved Cases: " + solvedCases);
        System.out.println("Chief Judge: " + chiefJudge);
        System.out.println("E-Filing Available: " + eFilingAvailable);
        System.out.println("Online Status Check: " + onlineStatusCheck);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Legal Aid Available: " + legalAidAvailable);
        System.out.println("Court Rooms: " + courtRooms);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("CCTV: " + CCTV);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Bar Association Name: " + barAssociationName);
        System.out.println("Mediation Available: " + mediationAvailable);
    }
}
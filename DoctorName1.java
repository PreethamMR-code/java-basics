class DoctorName1 {

    // External Way 
    // static String doctor1 = "Dr. Anya Sharma";
    // static String doctor2 = "Dr. Rohan Patel";
    // static String doctor3 = "Dr. Sarah Khan";
    // static String doctor4 = "Dr. David Lee";
    // static String doctor5 = "Dr. Emily White";
    // static String doctor6 = "Dr. Sanjay Gupta";
    // static String doctor7 = "Dr. Olivia Chen";
    // static String doctor8 = "Dr. Michael Brown";
    // static String doctor9 = "Dr. Aisha Rahman";
    // static String doctor10 = "Dr. Christopher Green";
    // static String[] doctorNames = {doctor1, doctor2, doctor3, doctor4, doctor5, doctor6, doctor7, doctor8, doctor9, doctor10};

    public static void main(String[] args) {
        System.out.println("main started");

        String doctor1 = "Dr. Anya Sharma";
        String doctor2 = "Dr. Rohan Patel";
        String doctor3 = "Dr. Sarah Khan";
        String doctor4 = "Dr. David Lee";
        String doctor5 = "Dr. Emily White";
        String doctor6 = "Dr. Sanjay Gupta";
        String doctor7 = "Dr. Olivia Chen";
        String doctor8 = "Dr. Michael Brown";
        String doctor9 = "Dr. Aisha Rahman";
        String doctor10 = "Dr. Christopher Green";

        String[] doctorNames = {
            doctor1, doctor2, doctor3, doctor4, doctor5,
            doctor6, doctor7, doctor8, doctor9, doctor10
        };

        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }

        System.out.println("main ended");
    }
}

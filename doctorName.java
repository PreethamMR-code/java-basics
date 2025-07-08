class doctorName {

    public static void displayDoctorNames() {
        String[] doctorNames = {
            "Dr. Anya Sharma", "Dr. Rohan Patel", "Dr. Sarah Khan", "Dr. David Lee",
            "Dr. Emily White", "Dr. Sanjay Gupta", "Dr. Olivia Chen",
            "Dr. Michael Brown", "Dr. Aisha Rahman", "Dr. Christopher Green"
        };

        for (String doctor : doctorNames) {
            System.out.println(doctor);
        }
    }

    public static void main(String[] args) {
        displayDoctorNames();
    }
}

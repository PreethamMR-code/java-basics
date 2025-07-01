class Ipl1 {

    // External Way 
    // static String team1 = "RCB";
    // static String team2 = "PBKS";
    // static String team3 = "MI";
    // static String team4 = "RR";
    // static String team5 = "SRH";
    // static String team6 = "KKR";
    // static String team7 = "DC";
    // static String team8 = "LSG";
    // static String team9 = "GT";
    // static String team10 = "CSK";
    // static String[] iplTeams = {team1, team2, team3, team4, team5, team6, team7, team8, team9, team10};

    public static void main(String[] args) {
        System.out.println("main started");

        String team1 = "RCB";
        String team2 = "PBKS";
        String team3 = "MI";
        String team4 = "RR";
        String team5 = "SRH";
        String team6 = "KKR";
        String team7 = "DC";
        String team8 = "LSG";
        String team9 = "GT";
        String team10 = "CSK";

        String[] iplTeams = {team1, team2, team3, team4, team5, team6, team7, team8, team9, team10};

        for (String team : iplTeams) {
            System.out.println(team);
        }

        System.out.println("main ended");
    }
}

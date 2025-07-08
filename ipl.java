class ipl {

    public static void displayIplTeams() {
        String[] iplTeams = {
            "RCB", "PBKS", "MI", "RR", "SRH",
            "KKR", "DC", "LSG", "GT", "CSK"
        };

        for (String team : iplTeams) {
            System.out.println(team);
        }
    }

    public static void main(String[] args) {
        displayIplTeams();
    }
}

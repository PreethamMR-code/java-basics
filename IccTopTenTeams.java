/*class IccTopTenTeams{

	static String team1 = "india";
	static String team2 = "Australia";
	static String team3 = "england";
	static String team4 = "south africa";
	static String team5 = "newzealand";
	static String team6 = "sri lanka";
	static String team7 = "west indies";
	static String team8 = "bangladesh";
	static String team9 = "afghanistan";
	static String team10 = "zimbabwe";
	
	static String [] teams = {team1,team2,team3, team4, team5, team6, team7, team8, team9, team10};
	
	public static void main(String args []){
	
	System.out.println("main started");
	
	for(String iccTopTeams : teams)
	{
		System.out.println(iccTopTeams);
	}
	
	
	System.out.println("main ended");
	}
}
*/

class IccTopTenTeams {
  
    // External Way----- using another variable for initialization like below
      static String team1="India";
      static String team2="New Zealand";
      static String team3="australia";
      static String team4="Sri Lanka";
      static String team5="Ireland";
      static String team6="South Africa";
      static String team7="Afganistan";
      static String team8="England";
      static String team9="Bngladesh";
      static String team10="West indies";
      
      teams[]={team1,team2,team3,team4,team5,team6,team7,team8,team9,team10};
     
     public static void main(String[] ar) {
        // Internal Way ------------- initialize Directly
        String team1 = "India";
        String team2 = "New Zealand";
        String team3 = "australia";
        String team4 = "Sri Lanka";
        String team5 = "Ireland";
        String team6 = "South Africa";
        String team7 = "Afganistan";
        String team8 = "England";
        String team9 = "Bngladesh";
        String team10 = "West indies";
        String teams[] = { team1, team2, team3, team4, team5, team6, team7, team8, team9, team10 };

        for (String team : teams) 
            System.out.println(team);
        

    }
    
}
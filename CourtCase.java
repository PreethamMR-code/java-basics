public class CourtCase {
    String caseNumber;
    String type;
    String status;
    String judge;
    int year;
    String judgeName;
    String courtName;

    CourtCase(){
        System.out.println("CourtCase constructor is invoked");
    }

    CourtCase(String caseNumber, String type, String status, String judge, int year, String judgeName, String courtName){
        System.out.println("CourtCase parameterized constructor is invoked");
        this.caseNumber = caseNumber;
        this.type = type;
        this.status = status;
        this.judge = judge;
        this.year = year;
        this.judgeName = judgeName;
        this.courtName = courtName;
    }

    public void getCourtCaseInfo() {
        System.out.println("\nCourt Case Details:");
        System.out.println("Case Number: " + caseNumber);
        System.out.println("Type: " + type);
        System.out.println("Status: " + status);
        System.out.println("Judge (Field): " + judge);
        System.out.println("Year: " + year);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Court Name: " + courtName);
    }
}
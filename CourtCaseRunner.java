public class CourtCaseRunner {
    public static void main(String[] args) {

        CourtCase c1 = new CourtCase("C001", "Civil", "Pending", "Justice Rao", 2020, "Justice Rao", "District Court, Bengaluru");
        /*c1.caseNumber = "C001";
        c1.type = "Civil";
        c1.status = "Pending";
        c1.judge = "Justice Rao";
        c1.year = 2020;
        c1.judgeName = "Justice Rao";
        c1.courtName = "District Court, Bengaluru";*/
        c1.getCourtCaseInfo();

        CourtCase c2 = new CourtCase("CR002", "Criminal", "Active", "Judge Smith", 2022, "Judge Smith", "High Court, Karnataka");
        /*c2.caseNumber = "CR002";
        c2.type = "Criminal";
        c2.status = "Active";
        c2.judge = "Judge Smith";
        c2.year = 2022;
        c2.judgeName = "Judge Smith";
        c2.courtName = "High Court, Karnataka";*/
        c2.getCourtCaseInfo();

        CourtCase c3 = new CourtCase("F003", "Family", "Closed", "Magistrate Lee", 2019, "Magistrate Lee", "Family Court, Mysore");
        /*c3.caseNumber = "F003";
        c3.type = "Family";
        c3.status = "Closed";
        c3.judge = "Magistrate Lee";
        c3.year = 2019;
        c3.judgeName = "Magistrate Lee";
        c3.courtName = "Family Court, Mysore";*/
        c3.getCourtCaseInfo();

        CourtCase c4 = new CourtCase("A004", "Appeals", "Under Review", "Chief Justice Kim", 2023, "Chief Justice Kim", "Supreme Court of India");
        /*c4.caseNumber = "A004";
        c4.type = "Appeals";
        c4.status = "Under Review";
        c4.judge = "Chief Justice Kim";
        c4.year = 2023;
        c4.judgeName = "Chief Justice Kim";
        c4.courtName = "Supreme Court of India";*/
        c4.getCourtCaseInfo();

        CourtCase c5 = new CourtCase("IP005", "Intellectual Property", "Discovery Phase", "Judge Patel", 2024, "Judge Patel", "Commercial Court, Delhi");
        /*c5.caseNumber = "IP005";
        c5.type = "Intellectual Property";
        c5.status = "Discovery Phase";
        c5.judge = "Judge Patel";
        c5.year = 2024;
        c5.judgeName = "Judge Patel";
        c5.courtName = "Commercial Court, Delhi";*/
        c5.getCourtCaseInfo();

        CourtCase c6 = new CourtCase("L006", "Labor", "Settled", "Justice Sharma", 2021, "Justice Sharma", "Labor Tribunal, Chennai");
        /*c6.caseNumber = "L006";
        c6.type = "Labor";
        c6.status = "Settled";
        c6.judge = "Justice Sharma";
        c6.year = 2021;
        c6.judgeName = "Justice Sharma";
        c6.courtName = "Labor Tribunal, Chennai";*/
        c6.getCourtCaseInfo();

        CourtCase c7 = new CourtCase("T007", "Tax", "Hearing Scheduled", "Judge Gupta", 2023, "Judge Gupta", "Income Tax Appellate Tribunal");
        /*c7.caseNumber = "T007";
        c7.type = "Tax";
        c7.status = "Hearing Scheduled";
        c7.judge = "Judge Gupta";
        c7.year = 2023;
        c7.judgeName = "Judge Gupta";
        c7.courtName = "Income Tax Appellate Tribunal";*/
        c7.getCourtCaseInfo();

        CourtCase c8 = new CourtCase("ENV008", "Environmental", "Investigation", "Justice Reddy", 2024, "Justice Reddy", "National Green Tribunal");
        /*c8.caseNumber = "ENV008";
        c8.type = "Environmental";
        c8.status = "Investigation";
        c8.judge = "Justice Reddy";
        c8.year = 2024;
        c8.judgeName = "Justice Reddy";
        c8.courtName = "National Green Tribunal";*/
        c8.getCourtCaseInfo();

        CourtCase c9 = new CourtCase("ADM009", "Administrative", "Verdict Issued", "Judge Singh", 2020, "Judge Singh", "Administrative Tribunal");
        /*c9.caseNumber = "ADM009";
        c9.type = "Administrative";
        c9.status = "Verdict Issued";
        c9.judge = "Judge Singh";
        c9.year = 2020;
        c9.judgeName = "Judge Singh";
        c9.courtName = "Administrative Tribunal";*/
        c9.getCourtCaseInfo();

        CourtCase c10 = new CourtCase("CON10", "Constitutional", "Arguments Concluded", "Chief Justice Kumar", 2023, "Chief Justice Kumar", "Supreme Court of India");
        /*c10.caseNumber = "CON10";
        c10.type = "Constitutional";
        c10.status = "Arguments Concluded";
        c10.judge = "Chief Justice Kumar";
        c10.year = 2023;
        c10.judgeName = "Chief Justice Kumar";
        c10.courtName = "Supreme Court of India";*/
        c10.getCourtCaseInfo();

        CourtCase c11 = new CourtCase("BANK11", "Bankruptcy", "Filed", "Judge Das", 2024, "Judge Das", "Debt Recovery Tribunal");
        /*c11.caseNumber = "BANK11";
        c11.type = "Bankruptcy";
        c11.status = "Filed";
        c11.judge = "Judge Das";
        c11.year = 2024;
        c11.judgeName = "Judge Das";
        c11.courtName = "Debt Recovery Tribunal";*/
        c11.getCourtCaseInfo();

        CourtCase c12 = new CourtCase("CYB12", "Cyber Crime", "Evidence Collection", "Justice Menon", 2024, "Justice Menon", "Cyber Crime Court, Hyderabad");
        /*c12.caseNumber = "CYB12";
        c12.type = "Cyber Crime";
        c12.status = "Evidence Collection";
        c12.judge = "Justice Menon";
        c12.year = 2024;
        c12.judgeName = "Justice Menon";
        c12.courtName = "Cyber Crime Court, Hyderabad";*/
        c12.getCourtCaseInfo();

        CourtCase c13 = new CourtCase("MED13", "Medical Malpractice", "Mediation", "Judge Iyer", 2022, "Judge Iyer", "Consumer Court, Mumbai");
        /*c13.caseNumber = "MED13";
        c13.type = "Medical Malpractice";
        c13.status = "Mediation";
        c13.judge = "Judge Iyer";
        c13.year = 2022;
        c13.judgeName = "Judge Iyer";
        c13.courtName = "Consumer Court, Mumbai";*/
        c13.getCourtCaseInfo();

        CourtCase c14 = new CourtCase("MAR14", "Maritime", "Adjourned", "Justice Pillai", 2021, "Justice Pillai", "Admiralty Court, Kochi");
        /*c14.caseNumber = "MAR14";
        c14.type = "Maritime";
        c14.status = "Adjourned";
        c14.judge = "Justice Pillai";
        c14.year = 2021;
        c14.judgeName = "Justice Pillai";
        c14.courtName = "Admiralty Court, Kochi";*/
        c14.getCourtCaseInfo();

        CourtCase c15 = new CourtCase("ELEC15", "Election Dispute", "Final Arguments", "Chief Justice Devi", 2023, "Chief Justice Devi", "Election Tribunal");
        /*c15.caseNumber = "ELEC15";
        c15.type = "Election Dispute";
        c15.status = "Final Arguments";
        c15.judge = "Chief Justice Devi";
        c15.year = 2023;
        c15.judgeName = "Chief Justice Devi";
        c15.courtName = "Election Tribunal";*/
        c15.getCourtCaseInfo();

        CourtCase c16 = new CourtCase("ART16", "Art Law", "Pending Decision", "Judge Kapoor", 2024, "Judge Kapoor", "Civil Court, Kolkata");
        /*c16.caseNumber = "ART16";
        c16.type = "Art Law";
        c16.status = "Pending Decision";
        c16.judge = "Judge Kapoor";
        c16.year = 2024;
        c16.judgeName = "Judge Kapoor";
        c16.courtName = "Civil Court, Kolkata";*/
        c16.getCourtCaseInfo();

        CourtCase c17 = new CourtCase("SPRT17", "Sports Law", "Arbitration", "Justice Prasad", 2022, "Justice Prasad", "Sports Arbitration Tribunal");
        /*c17.caseNumber = "SPRT17";
        c17.type = "Sports Law";
        c17.status = "Arbitration";
        c17.judge = "Justice Prasad";
        c17.year = 2022;
        c17.judgeName = "Justice Prasad";
        c17.courtName = "Sports Arbitration Tribunal";*/
        c17.getCourtCaseInfo();

        CourtCase c18 = new CourtCase("DEF18", "Defamation", "Cross-Examination", "Judge Verma", 2023, "Judge Verma", "Magistrate Court, Pune");
        /*c18.caseNumber = "DEF18";
        c18.type = "Defamation";
        c18.status = "Cross-Examination";
        c18.judge = "Judge Verma";
        c18.year = 2023;
        c18.judgeName = "Judge Verma";
        c18.courtName = "Magistrate Court, Pune";*/
        c18.getCourtCaseInfo();

        CourtCase c19 = new CourtCase("EDU19", "Education Law", "Dismissed", "Justice Bose", 2021, "Justice Bose", "High Court, Delhi");
        /*c19.caseNumber = "EDU19";
        c19.type = "Education Law";
        c19.status = "Dismissed";
        c19.judge = "Justice Bose";
        c19.year = 2021;
        c19.judgeName = "Justice Bose";
        c19.courtName = "High Court, Delhi";*/
        c19.getCourtCaseInfo();

        CourtCase c20 = new CourtCase("EDU20", "Education Law", "Dismissed", "Justice Bose", 2021, "Justice Bose", "High Court, Delhi");
        /*c20.caseNumber = "EDU20";
        c20.type = "Education Law";
        c20.status = "Dismissed";
        c20.judge = "Justice Bose";
        c20.year = 2021;
        c20.judgeName = "Justice Bose";
        c20.courtName = "High Court, Delhi";*/
        c20.getCourtCaseInfo();
    }
}
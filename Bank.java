public class Bank {

     static String name;
    static String branch;
      static String location;
    static String ifscCode;
    static String managerName;
    static int employeesCount;
     static int customersCount;
    static double totalAssets;
     static double interestRate;
    static boolean isInternational;
     static String bankCode;
     static boolean onlineBankingAvailable;
    static String establishedDate;
     static String licenseNumber;
      static String currencyType;
    static String contactNumber;
      static boolean hasATM;
      static boolean isPrivate;
     static boolean isGovernment;
     static String timings;

    public static void main(String bank[]) {

        System.out.println("Bank Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Location: " + location);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Employees Count: " + employeesCount);
        System.out.println("Customers Count: " + customersCount);
        System.out.println("Total Assets: " + totalAssets + " Crores");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Is International: " + isInternational);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Online Banking Available: " + onlineBankingAvailable);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Currency Type: " + currencyType);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Has ATM: " + hasATM);
        System.out.println("Is Private: " + isPrivate);
        System.out.println("Is Government: " + isGovernment);
        System.out.println("Bank Timings: " + timings);

         name = "Sbi";
         branch = "MG Road";
         location = "Bangalore";
         ifscCode = "SBIN0001234";
			managerName = "Mr. Rajesh Sharma";
        employeesCount = 150;
		customersCount = 50000;
         totalAssets = 1200.75;
        interestRate = 6.5;
			isInternational = true;
        bankCode = "SBI001";
			onlineBankingAvailable = true;
        establishedDate = "01-07-1955";
			licenseNumber = "LICSBI123456";
        currencyType = "INR";
          contactNumber = "+91-9876543210";
         hasATM = true;
         isPrivate = false;
        isGovernment = true;
         timings = "10:00 AM to 4:00 PM";

        System.out.println("Bank Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Location: " + location);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Employees Count: " + employeesCount);
        System.out.println("Customers Count: " + customersCount);
        System.out.println("Total Assets: " + totalAssets + " Crores");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Is International: " + isInternational);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Online Banking Available: " + onlineBankingAvailable);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Currency Type: " + currencyType);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Has ATM: " + hasATM);
        System.out.println("Is Private: " + isPrivate);
        System.out.println("Is Government: " + isGovernment);
        System.out.println("Bank Timings: " + timings);
    }
}

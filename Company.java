class Company {
    String name;
    String industry;
    int employees;

    Company() {
        this.name = "Tech Solutions Inc.";
        this.industry = "Software Development";
        this.employees = 1500;
    }

    void getCompanyInfo() {
        System.out.println("-----Company Details------");
        System.out.println("Company Name: " + name);
        System.out.println("Industry: " + industry);
        System.out.println("Employees: " + employees);
    }
}


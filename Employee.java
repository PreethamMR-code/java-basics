class Employee {
    String name;
    int id;
    String department;
    double salary;
    String position;
    int yearsOfService;

    Employee() {
        this("Unknown", 0, "General", 30000, "Employee", 1);
    }
    Employee(String name) {
        this(name, 0, "General", 30000, "Employee", 1);
    }
    Employee(String name, int id) {
        this(name, id, "General", 30000, "Employee", 1);
    }
    Employee(String name, int id, String department) {
        this(name, id, department, 30000, "Employee", 1);
    }
    Employee(String name, int id, String department, double salary) {
        this(name, id, department, salary, "Employee", 1);
    }
    Employee(String name, int id, String department, double salary, String position) {
        this(name, id, department, salary, position, 1);
    }
    Employee(String name, int id, String department, double salary, String position, int yearsOfService) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.position = position;
        this.yearsOfService = yearsOfService;
    }
    void display() {
        System.out.println(name + " ID:" + id + " Dept:" + department + " $" + salary + " " + position + " YOS: " + yearsOfService);
    }
}


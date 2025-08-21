class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee("Alice");
        e2.display();
        Employee e3 = new Employee("Bob", 101);
        e3.display();
        Employee e4 = new Employee("Carol", 102, "HR");
        e4.display();
        Employee e5 = new Employee("David", 103, "IT", 80000);
        e5.display();
        Employee e6 = new Employee("Eve", 104, "Sales", 75000, "Manager");
        e6.display();
        Employee e7 = new Employee("Frank", 105, "Marketing", 90000, "Director", 10);
        e7.display();
    }
}

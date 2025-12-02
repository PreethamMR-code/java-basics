class Politician {
    String name;
    String party;
    int age;
    String constituency;
    String position;
    String state;

    Politician(){
        System.out.println("Politician constructor is invoked");
    }

    Politician(String name, String party, int age, String constituency, String position, String state){
        System.out.println("Politician parameterized constructor is invoked");
        this.name = name;
        this.party = party;
        this.age = age;
        this.constituency = constituency;
        this.position = position;
        this.state = state;
    }

    public void getPoliticianInfo() {
        System.out.println("\nPolitician Details:");
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Age: " + age);
        System.out.println("Constituency: " + constituency);
        System.out.println("Position: " + position);
        System.out.println("State: " + state);
    }
}
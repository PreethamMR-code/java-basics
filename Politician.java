class Politician {
    String name;
    String party;
    String position;

    Politician() {
        this.name = "Tejasvi Surya";
        this.party = "BJP";
        this.position = "Member of Parliament";
    }

    void getPoliticianInfo() {
        System.out.println("-----Politician Details------");
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Position: " + position);
    }
}


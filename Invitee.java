class Invitee {
    String name;
    String email;
    String role;

    Invitee() {
        this.name = "Alice Smith";
        this.email = "alice.s@example.com";
        this.role = "Team Lead";
    }

    void getInviteeInfo() {
        System.out.println("-----Invitee Details------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }
}


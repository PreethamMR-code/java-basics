class Contacts {
    String name;
    String phoneNumber;
    String email;

    Contacts() {
        this.name = "John Doe";
        this.phoneNumber = "9876543210";
        this.email = "john.doe@example.com";
    }

    void getContactsInfo() {
        System.out.println("-----Contact Details------");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}


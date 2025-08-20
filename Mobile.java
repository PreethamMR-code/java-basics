class Mobile {
    String brand;
    String model;
    String operatingSystem;

    PhoneBook phoneBook;

    Mobile() {
        this.brand = "Samsung";
        this.model = "Galaxy S23";
        this.operatingSystem = "Android";
    }

    void getMobileInfo() {
        System.out.println("-------Mobile Details-------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + operatingSystem);

        this.phoneBook.getPhoneBookInfo();
    }
}


class PhoneBook {
    int totalContacts;
    String lastSyncDate;
    String cloudService;

    Contacts contacts;

    PhoneBook() {
        this.totalContacts = 500;
        this.lastSyncDate = "2025-07-30";
        this.cloudService = "Google Contacts";
    }

    void getPhoneBookInfo() {
        System.out.println("-------PhoneBook Details ------");
        System.out.println("Total Contacts: " + totalContacts);
        System.out.println("Last Sync Date: " + lastSyncDate);
        System.out.println("Cloud Service: " + cloudService);

        this.contacts.getContactsInfo();
    }
}

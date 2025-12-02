class MobileRunner {
    public static void main(String args[]) {
        Mobile mobile = new Mobile();
        PhoneBook phoneBook = new PhoneBook();
        Contacts contacts = new Contacts();

        mobile.phoneBook = phoneBook;
        phoneBook.contacts = contacts;

        mobile.getMobileInfo();
    }
}
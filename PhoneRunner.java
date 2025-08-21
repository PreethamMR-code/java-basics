class PhoneRunner {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.display();
        Phone p2 = new Phone("Apple");
        p2.display();
        Phone p3 = new Phone("Google", "Pixel 6");
        p3.display();
        Phone p4 = new Phone("OnePlus", "9 Pro", "Android");
        p4.display();
        Phone p5 = new Phone("Xiaomi", "Mi 11", "Android", 12);
        p5.display();
        Phone p6 = new Phone("Sony", "Xperia", "Android", 8, 256);
        p6.display();
        Phone p7 = new Phone("Huawei", "P40", "Android", 8, 128, 850);
        p7.display();
    }
}
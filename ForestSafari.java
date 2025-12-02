class ForestSafari {
    String name;
    String location;
    String duration;
    String type;
    double price;

    ForestSafari(){
        System.out.println("ForestSafari constructor is invoked");
    }

    ForestSafari(String name, String location, String duration, String type, double price){
        System.out.println("ForestSafari parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.duration = duration;
        this.type = type;
        this.price = price;
    }

    public void getSafariInfo() {
        System.out.println("\nForest Safari Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }
}
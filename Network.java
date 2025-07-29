class Network {
    String name; 
    String provider;
    String type;
    double speed;
    String region;
    String frequency;
    String country; 
    String status; 

    Network(){
        System.out.println("Network constructor is invoked");
    }

    Network(String name, String provider, String type, double speed, String region, String frequency, String country, String status){
        System.out.println("Network parameterized constructor is invoked");
        this.name = name;
        this.provider = provider;
        this.type = type;
        this.speed = speed;
        this.region = region;
        this.frequency = frequency;
        this.country = country;
        this.status = status;
    }

    public void getNetworkInfo() {
        System.out.println("\nNetwork Details:");
        System.out.println("Name: " + name);
        System.out.println("Provider: " + provider);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Region: " + region);
        System.out.println("Frequency: " + frequency);
        System.out.println("Country: " + country);
        System.out.println("Status: " + status);
    }
}
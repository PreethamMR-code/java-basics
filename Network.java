public class Network {
    String provider;
    String type;
    double speed;
    String region;
    String frequency;

    public void getNetworkInfo() {
        System.out.println("\nNetwork Details:");
        System.out.println("Provider: " + provider);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Region: " + region);
        System.out.println("Frequency: " + frequency);
    }
}
public class Desktop {

     static String brand;
    static String model;
      static String processor;
    static int ramSize;
    static int storageSize;
      static String storageType;
    static String os;
    static String graphicsCard;
   static boolean isWiFiEnabled;
    static int usbPorts;
   static boolean bluetoothAvailable;
    static String motherboard;
    static int powerSupply;
     static String cabinetType;
    static double weight;
     static boolean hasMonitor;
    static int monitorSize;
     static String keyboardType;
    static String mouseType;
     static String color;

    public static void main(String[] args) {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage Size: " + storageSize + "GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Operating System: " + os);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Wi-Fi Enabled: " + isWiFiEnabled);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Bluetooth Available: " + bluetoothAvailable);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Power Supply: " + powerSupply + "W");
        System.out.println("Cabinet Type: " + cabinetType);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Has Monitor: " + hasMonitor);
        System.out.println("Monitor Size: " + (hasMonitor ? monitorSize + " inches" : "N/A"));
        System.out.println("Keyboard Type: " + keyboardType);
        System.out.println("Mouse Type: " + mouseType);
        System.out.println("Color: " + color);

      brand = "Dell";
       model = "XPS 8950";
         processor = "Intel Core i7-12700K";
         ramSize = 32;
          storageSize = 1000;
      storageType = "SSD";
       os = "Windows 11 Pro";
          graphicsCard = "NVIDIA GeForce RTX 3070";
      isWiFiEnabled = true;
			usbPorts = 10;
       bluetoothAvailable = true;
         motherboard = "Dell Custom Z690";
         powerSupply = 750;
        cabinetType = "Mid Tower";
        weight = 9.5;
      hasMonitor = false;
      monitorSize = 0;
     keyboardType = "Wired Standard";
         mouseType = "Wired Optical";
     color = "Black";

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage Size: " + storageSize + "GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Operating System: " + os);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Wi-Fi Enabled: " + isWiFiEnabled);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Bluetooth Available: " + bluetoothAvailable);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Power Supply: " + powerSupply + "W");
        System.out.println("Cabinet Type: " + cabinetType);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Has Monitor: " + hasMonitor);
        System.out.println("Monitor Size: " + (hasMonitor ? monitorSize + " inches" : "N/A"));
        System.out.println("Keyboard Type: " + keyboardType);
        System.out.println("Mouse Type: " + mouseType);
        System.out.println("Color: " + color);
    }
}

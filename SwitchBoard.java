class SwitchBoard {

    static int totalSwitches;
      static int totalSockets;
    static String material;
    static String color;
     static boolean isModular;
    static boolean hasFuse;
     static boolean hasIndicator;
     static int usbPorts;
     static int voltageCapacity;
    static String brand;
      static int length;
     static int width;
     static int height;
    static String installationType;
    static String wiringType;
     static boolean isSmart;
     static String modelNumber;
    static String warranty;
     static boolean overloadProtection;
    static boolean surgeProtection;

    public static void main(String[] args) {
        System.out.println("Total Switches: " + totalSwitches);
        System.out.println("Total Sockets: " + totalSockets);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Is Modular: " + isModular);
        System.out.println("Has Fuse: " + hasFuse);
        System.out.println("Has Indicator: " + hasIndicator);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Voltage Capacity: " + voltageCapacity + "V");
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Installation Type: " + installationType);
        System.out.println("Wiring Type: " + wiringType);
        System.out.println("Is Smart: " + isSmart);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Warranty: " + warranty);
        System.out.println("Overload Protection: " + overloadProtection);
        System.out.println("Surge Protection: " + surgeProtection);

        totalSwitches = 6;
       totalSockets = 3;
         material = "Polycarbonate";
        color = "White";
         isModular = true;
			hasFuse = false;
         hasIndicator = true;
        usbPorts = 2;
         voltageCapacity = 240;
        brand = "Legrand";
        length = 20;
          width = 10;
        height = 5;
          installationType = "Surface Mount";
         wiringType = "Concealed";
        isSmart = false;
          modelNumber = "LGD-SWB-001";
         warranty = "2 Years";
      overloadProtection = true;
        surgeProtection = true;

        System.out.println("Total Switches: " + totalSwitches);
        System.out.println("Total Sockets: " + totalSockets);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Is Modular: " + isModular);
        System.out.println("Has Fuse: " + hasFuse);
        System.out.println("Has Indicator: " + hasIndicator);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Voltage Capacity: " + voltageCapacity + "V");
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Installation Type: " + installationType);
        System.out.println("Wiring Type: " + wiringType);
        System.out.println("Is Smart: " + isSmart);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Warranty: " + warranty);
        System.out.println("Overload Protection: " + overloadProtection);
        System.out.println("Surge Protection: " + surgeProtection);
    }
}

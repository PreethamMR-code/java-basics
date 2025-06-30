class Satellite
{
    static String satelliteName;
     static  String satelliteID;
    static   String launchVehicle;
     static String launchDate;
    static  String orbitType;
    static  double orbitalAltitudeKm;
   static double orbitalPeriodMinutes;
     static  String primaryPurpose;
    static String operatorAgency;
     static String currentStatus;
   static int numberOfInstruments;
    static   double communicationBandwidthMbps;
    static   double powerOutputWatts;
     static int expectedLifespanYears;
    static int yearsInOrbit;
     static  double massKg;
    static  double velocityKmh;
   static boolean isGeostationary;
    static  boolean hasSolarPanels;
    static String lastMaintenanceDate;

    public static void main(String SatelliteInfo[])
    {
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite ID: " + satelliteID);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbital Altitude (km): " + orbitalAltitudeKm);
        System.out.println("Orbital Period (minutes): " + orbitalPeriodMinutes);
        System.out.println("Primary Purpose: " + primaryPurpose);
        System.out.println("Operator Agency: " + operatorAgency);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Number of Instruments: " + numberOfInstruments);
        System.out.println("Communication Bandwidth (Mbps): " + communicationBandwidthMbps);
        System.out.println("Power Output (Watts): " + powerOutputWatts);
        System.out.println("Expected Lifespan (Years): " + expectedLifespanYears);
        System.out.println("Years in Orbit: " + yearsInOrbit);
        System.out.println("Mass (kg): " + massKg);
        System.out.println("Velocity (km/h): " + velocityKmh);
        System.out.println("Is Geostationary: " + isGeostationary);
        System.out.println("Has Solar Panels: " + hasSolarPanels);
        System.out.println("Last Maintenance Date: " + lastMaintenanceDate);

        satelliteName = "Adithya";
        satelliteID = "A1234";
         launchVehicle = "Space Shuttle Discovery";
        launchDate = "2025-04-24";
         orbitType = "Low Earth Orbit";
       orbitalAltitudeKm = 540.0;
      orbitalPeriodMinutes = 95.4;
         primaryPurpose = "Astronomy";
         operatorAgency = "ISRO";
          currentStatus = "Operational";
      numberOfInstruments = 5;
   communicationBandwidthMbps = 10.0;
          powerOutputWatts = 2800.0;
       expectedLifespanYears = 15;
          yearsInOrbit = 35;
        massKg = 11110.0;
       velocityKmh = 27300.0;
         isGeostationary = false;
        hasSolarPanels = true;
        lastMaintenanceDate = "2025-05-19";

        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite ID: " + satelliteID);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbital Altitude (km): " + orbitalAltitudeKm);
        System.out.println("Orbital Period (minutes): " + orbitalPeriodMinutes);
        System.out.println("Primary Purpose: " + primaryPurpose);
        System.out.println("Operator Agency: " + operatorAgency);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Number of Instruments: " + numberOfInstruments);
        System.out.println("Communication Bandwidth (Mbps): " + communicationBandwidthMbps);
        System.out.println("Power Output (Watts): " + powerOutputWatts);
        System.out.println("Expected Lifespan (Years): " + expectedLifespanYears);
        System.out.println("Years in Orbit: " + yearsInOrbit);
        System.out.println("Mass (kg): " + massKg);
        System.out.println("Velocity (km/h): " + velocityKmh);
        System.out.println("Is Geostationary: " + isGeostationary);
        System.out.println("Has Solar Panels: " + hasSolarPanels);
        System.out.println("Last Maintenance Date: " + lastMaintenanceDate);
    }
}

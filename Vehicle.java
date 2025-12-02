class Vehicle{
    static String vehicleNumber;
    static String owner;

    public static boolean registerVehicle(String number,String ownerName) {
        boolean isNumberValid=false;
        boolean isOwnerValid=false;
        boolean isRegistered=false;

        if (number!=null){
            vehicleNumber=number;
            isNumberValid=true;
        }

        if (ownerName!=null){
            owner=ownerName;
            isOwnerValid=true;
        }

        if (isNumberValid==true){
            isRegistered=true;
        }

        return isRegistered;
    }

    public static void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + owner);
    }
}

class DistanceConverter {
    public static void main(String[] args) {
        convertKmToMiles(10);
        convertKmToMiles(25);
        convertKmToMiles(100);
    }

    public static void convertKmToMiles(double km) {
        double miles = km * 0.621371;
        System.out.println(km + " km = " + miles + " miles");
    }
}
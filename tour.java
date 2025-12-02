class tour {

    public static void displayTouristPlaces() {
        String[] touristPlaces = {
            "iskon temple", "mysuru palace", "lalbagh", "nandi hills", "jog falls",
            "hampi", "coorg", "madikeri", "gokarna", "kudremuka",
            "dandeli", "murudeshwra", "badami caves", "bhadra tiger reservoir", "srirangapatna"
        };

        for (String place : touristPlaces) {
            System.out.println(place);
        }
    }

    public static void main(String[] args) {
        displayTouristPlaces();
    }
}

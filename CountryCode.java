class CountryCode {

    static String CountryName;

    public static int getCountryCode(String CountryName) {

        int countryCode = 0;

        if (CountryName.equals("India")) {
            countryCode = 91;
        } 
        else if (CountryName.equals("China")) {
            countryCode = 86;
        } 
        else if (CountryName.equals("Japan")) {
            countryCode = 81;
        } 
        else if (CountryName.equals("South Korea")) {
            countryCode = 82;
        } 
        else if (CountryName.equals("Nepal")) {
            countryCode = 977;
        } 
        else if (CountryName.equals("Bhutan")) {
            countryCode = 975;
        } 
        else if (CountryName.equals("Bangladesh")) {
            countryCode = 880;
        } 
        else if (CountryName.equals("Pakistan")) {
            countryCode = 92;
        } 
        else if (CountryName.equals("Sri Lanka")) {
            countryCode = 94;
        } 
        else if (CountryName.equals("Maldives")) {
            countryCode = 960;
        } 
        else if (CountryName.equals("Thailand")) {
            countryCode = 66;
        } 
        else if (CountryName.equals("Singapore")) {
            countryCode = 65;
        } 
        else if (CountryName.equals("Indonesia")) {
            countryCode = 62;
        } 
        else if (CountryName.equals("Malaysia")) {
            countryCode = 60;
        } 
        else if (CountryName.equals("Vietnam")) {
            countryCode = 84;
        } 
        else if (CountryName.equals("Philippines")) {
            countryCode = 63;
        } 
        else if (CountryName.equals("Myanmar")) {
            countryCode = 95;
        } 
        else if (CountryName.equals("Cambodia")) {
            countryCode = 855;
        } 
        else if (CountryName.equals("Laos")) {
            countryCode = 856;
        } 
        else if (CountryName.equals("Afghanistan")) {
            countryCode = 93;
        } 
        else if (CountryName.equals("Iran")) {
            countryCode = 98;
        } 
        else if (CountryName.equals("Iraq")) {
            countryCode = 964;
        } 
        else if (CountryName.equals("Saudi Arabia")) {
            countryCode = 966;
        } 
        else if (CountryName.equals("United Arab Emirates")) {
            countryCode = 971;
        } 
        else if (CountryName.equals("Qatar")) {
            countryCode = 974;
        } 
        else if (CountryName.equals("Kuwait")) {
            countryCode = 965;
        } 
        else if (CountryName.equals("Oman")) {
            countryCode = 968;
        } 
        else if (CountryName.equals("Yemen")) {
            countryCode = 967;
        } 
        else if (CountryName.equals("Israel")) {
            countryCode = 972;
        } 
        else if (CountryName.equals("Palestine")) {
            countryCode = 970;
        } 
        else if (CountryName.equals("Jordan")) {
            countryCode = 962;
        } 
        else if (CountryName.equals("Lebanon")) {
            countryCode = 961;
        } 
        else if (CountryName.equals("Turkey")) {
            countryCode = 90;
        } 
        else if (CountryName.equals("Russia")) {
            countryCode = 7;
        } 
        else if (CountryName.equals("Uzbekistan")) {
            countryCode = 998;
        } 
        else if (CountryName.equals("Kazakhstan")) {
            countryCode = 7;
        } 
        else if (CountryName.equals("Kyrgyzstan")) {
            countryCode = 996;
        } 
        else if (CountryName.equals("Tajikistan")) {
            countryCode = 992;
        } 
        else if (CountryName.equals("Turkmenistan")) {
            countryCode = 993;
        } 
        else if (CountryName.equals("Mongolia")) {
            countryCode = 976;
        } 
        else if (CountryName.equals("Taiwan")) {
            countryCode = 886;
        } 
        else if (CountryName.equals("North Korea")) {
            countryCode = 850;
        } 
        else if (CountryName.equals("Georgia")) {
            countryCode = 995;
        } 
        else if (CountryName.equals("Armenia")) {
            countryCode = 374;
        } 
        else if (CountryName.equals("Azerbaijan")) {
            countryCode = 994;
        } 
        else if (CountryName.equals("Egypt")) {
            countryCode = 20;
        } 
        else if (CountryName.equals("Ethiopia")) {
            countryCode = 251;
        } 
        else if (CountryName.equals("South Africa")) {
            countryCode = 27;
        } 
        else if (CountryName.equals("United Kingdom")) {
            countryCode = 44;
        } 
        else if (CountryName.equals("United States")) {
            countryCode = 1;
        } 
        else {
            System.out.println("Not Valid Country Name ");
        }

        return countryCode;
    }

    public static void main(String[] args) 
	{
        int code = getCountryCode("United States");
        System.out.println("Country Code is : " + code);
    }
}

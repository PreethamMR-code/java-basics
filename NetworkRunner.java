class NetworkRunner {
    public static void main(String[] args) {

        Network network1 = new Network("Airtel", "Airtel", "4G", 50.0, "South Asia", "1800MHz", "India", "Active");
        /*network1.name = "Airtel";
        network1.provider = "Airtel";
        network1.type = "4G";
        network1.speed = 50.0;
        network1.region = "South Asia";
        network1.frequency = "1800MHz";
        network1.country = "India";
        network1.status = "Active";*/
        network1.getNetworkInfo();

        Network network2 = new Network("Jio", "Reliance Jio", "5G", 100.0, "South Asia", "700MHz", "India", "Active");
        /*network2.name = "Jio";
        network2.provider = "Reliance Jio";
        network2.type = "5G";
        network2.speed = 100.0;
        network2.region = "South Asia";
        network2.frequency = "700MHz";
        network2.country = "India";
        network2.status = "Active";*/
        network2.getNetworkInfo();

        Network network3 = new Network("BSNL", "BSNL", "3G", 10.0, "South Asia", "2100MHz", "India", "Inactive");
        /*network3.name = "BSNL";
        network3.provider = "BSNL";
        network3.type = "3G";
        network3.speed = 10.0;
        network3.region = "South Asia";
        network3.frequency = "2100MHz";
        network3.country = "India";
        network3.status = "Inactive";*/
        network3.getNetworkInfo();

        Network network4 = new Network("Vodafone UK", "Vodafone", "4G", 40.0, "Europe", "800MHz", "UK", "Active");
        /*network4.name = "Vodafone UK";
        network4.provider = "Vodafone";
        network4.type = "4G";
        network4.speed = 40.0;
        network4.region = "Europe";
        network4.frequency = "800MHz";
        network4.country = "UK";
        network4.status = "Active";*/
        network4.getNetworkInfo();

        Network network5 = new Network("T-Mobile US", "T-Mobile", "5G", 120.0, "North America", "600MHz", "USA", "Active");
        /*network5.name = "T-Mobile US";
        network5.provider = "T-Mobile";
        network5.type = "5G";
        network5.speed = 120.0;
        network5.region = "North America";
        network5.frequency = "600MHz";
        network5.country = "USA";
        network5.status = "Active";*/
        network5.getNetworkInfo();

        Network network6 = new Network("Verizon Wireless", "Verizon", "5G", 150.0, "North America", "28GHz", "USA", "Active");
        /*network6.name = "Verizon Wireless";
        network6.provider = "Verizon";
        network6.type = "5G";
        network6.speed = 150.0;
        network6.region = "North America";
        network6.frequency = "28GHz";
        network6.country = "USA";
        network6.status = "Active";*/
        network6.getNetworkInfo();

        Network network7 = new Network("AT&T Mobility", "AT&T", "4G", 80.0, "North America", "700MHz", "USA", "Active");
        /*network7.name = "AT&T Mobility";
        network7.provider = "AT&T";
        network7.type = "4G";
        network7.speed = 80.0;
        network7.region = "North America";
        network7.frequency = "700MHz";
        network7.country = "USA";
        network7.status = "Active";*/
        network7.getNetworkInfo();

        Network network8 = new Network("Orange France", "Orange", "4G", 60.0, "Europe", "2600MHz", "France", "Active");
        /*network8.name = "Orange France";
        network8.provider = "Orange";
        network8.type = "4G";
        network8.speed = 60.0;
        network8.region = "Europe";
        network8.frequency = "2600MHz";
        network8.country = "France";
        network8.status = "Active";*/
        network8.getNetworkInfo();

        Network network9 = new Network("Idea Cellular", "Idea", "3G", 20.0, "South Asia", "900MHz", "India", "Inactive");
        /*network9.name = "Idea Cellular";
        network9.provider = "Idea";
        network9.type = "3G";
        network9.speed = 20.0;
        network9.region = "South Asia";
        network9.frequency = "900MHz";
        network9.country = "India";
        network9.status = "Inactive";*/
        network9.getNetworkInfo();

        Network network10 = new Network("China Mobile", "China Mobile", "5G", 200.0, "East Asia", "2.6GHz", "China", "Active");
        /*network10.name = "China Mobile";
        network10.provider = "China Mobile";
        network10.type = "5G";
        network10.speed = 200.0;
        network10.region = "East Asia";
        network10.frequency = "2.6GHz";
        network10.country = "China";
        network10.status = "Active";*/
        network10.getNetworkInfo();

        Network network11 = new Network("NTT Docomo", "NTT Docomo", "4G", 70.0, "East Asia", "2.1GHz", "Japan", "Active");
        /*network11.name = "NTT Docomo";
        network11.provider = "NTT Docomo";
        network11.type = "4G";
        network11.speed = 70.0;
        network11.region = "East Asia";
        network11.frequency = "2.1GHz";
        network11.country = "Japan";
        network11.status = "Active";*/
        network11.getNetworkInfo();

        Network network12 = new Network("Movistar Spain", "Movistar", "4G", 55.0, "Europe", "1800MHz", "Spain", "Active");
        /*network12.name = "Movistar Spain";
        network12.provider = "Movistar";
        network12.type = "4G";
        network12.speed = 55.0;
        network12.region = "Europe";
        network12.frequency = "1800MHz";
        network12.country = "Spain";
        network12.status = "Active";*/
        network12.getNetworkInfo();

        Network network13 = new Network("KPN Netherlands", "KPN", "4G", 45.0, "Europe", "800MHz", "Netherlands", "Active");
        /*network13.name = "KPN Netherlands";
        network13.provider = "KPN";
        network13.type = "4G";
        network13.speed = 45.0;
        network13.region = "Europe";
        network13.frequency = "800MHz";
        network13.country = "Netherlands";
        network13.status = "Active";*/
        network13.getNetworkInfo();

        Network network14 = new Network("TIM Italy", "TIM", "5G", 180.0, "Europe", "3.7GHz", "Italy", "Active");
        /*network14.name = "TIM Italy";
        network14.provider = "TIM";
        network14.type = "5G";
        network14.speed = 180.0;
        network14.region = "Europe";
        network14.frequency = "3.7GHz";
        network14.country = "Italy";
        network14.status = "Active";*/
        network14.getNetworkInfo();

        Network network15 = new Network("Etisalat UAE", "Etisalat", "5G", 190.0, "Middle East", "3.5GHz", "UAE", "Active");
        /*network15.name = "Etisalat UAE";
        network15.provider = "Etisalat";
        network15.type = "5G";
        network15.speed = 190.0;
        network15.region = "Middle East";
        network15.frequency = "3.5GHz";
        network15.country = "UAE";
        network15.status = "Active";*/
        network15.getNetworkInfo();

        Network network16 = new Network("Optus Australia", "Optus", "5G", 110.0, "Oceania", "3.6GHz", "Australia", "Active");
        /*network16.name = "Optus Australia";
        network16.provider = "Optus";
        network16.type = "5G";
        network16.speed = 110.0;
        network16.region = "Oceania";
        network16.frequency = "3.6GHz";
        network16.country = "Australia";
        network16.status = "Active";*/
        network16.getNetworkInfo();

        Network network17 = new Network("Rogers Canada", "Rogers", "5G", 130.0, "North America", "3.5GHz", "Canada", "Active");
        /*network17.name = "Rogers Canada";
        network17.provider = "Rogers";
        network17.type = "5G";
        network17.speed = 130.0;
        network17.region = "North America";
        network17.frequency = "3.5GHz";
        network17.country = "Canada";
        network17.status = "Active";*/
        network17.getNetworkInfo();

        Network network18 = new Network("Singtel Singapore", "Singtel", "5G", 170.0, "Southeast Asia", "2.1GHz", "Singapore", "Active");
        /*network18.name = "Singtel Singapore";
        network18.provider = "Singtel";
        network18.type = "5G";
        network18.speed = 170.0;
        network18.region = "Southeast Asia";
        network18.frequency = "2.1GHz";
        network18.country = "Singapore";
        network18.status = "Active";*/
        network18.getNetworkInfo();

        Network network19 = new Network("Telefónica Germany", "Telefónica", "4G", 65.0, "Europe", "800MHz", "Germany", "Active");
        /*network19.name = "Telefónica Germany";
        network19.provider = "Telefónica";
        network19.type = "4G";
        network19.speed = 65.0;
        network19.region = "Europe";
        network19.frequency = "800MHz";
        network19.country = "Germany";
        network19.status = "Active";*/
        network19.getNetworkInfo();

        Network network20 = new Network("SoftBank Japan", "SoftBank", "5G", 160.0, "East Asia", "3.9GHz", "Japan", "Active");
        /*network20.name = "SoftBank Japan";
        network20.provider = "SoftBank";
        network20.type = "5G";
        network20.speed = 160.0;
        network20.region = "East Asia";
        network20.frequency = "3.9GHz";
        network20.country = "Japan";
        network20.status = "Active";*/
        network20.getNetworkInfo();
    }
}
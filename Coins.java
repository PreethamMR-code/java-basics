public class Coins {
    String material;
    String origin;
    int year;
    double diameter;
    String symbol;

    Coins(){
        System.out.println("Coins constructor is invoked");
    }

    Coins(String material, String origin, int year, double diameter, String symbol){
        System.out.println("Coins parameterized constructor is invoked");
        this.material = material;
        this.origin = origin;
        this.year = year;
        this.diameter = diameter;
        this.symbol = symbol;
    }

    public void getCoinsInfo()
    {
        System.out.println("\nCoins Details:");
        System.out.println("Material: " + material);
        System.out.println("Origin: " + origin);
        System.out.println("Year: " + year);
        System.out.println("Diameter: " + diameter + " mm");
        System.out.println("Symbol: " + symbol);
    }
}
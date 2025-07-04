class TemperatureConverter {
    public static void main(String[] args) {
        convertToFahrenheit(0);
        convertToFahrenheit(30);
        convertToFahrenheit(100);
    }

    public static void convertToFahrenheit(int celsius) {
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
package D03_Encapsulation;
//3. Temperature Converter
//Class with private double celsius.
//Provide public methods to convert it to Fahrenheit and Kelvin.
//Keep data hidden from direct access

public class TemperatureConverter {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();

        System.out.println("Celsius: " + temp.getCelsius() + "°C");
        System.out.println("Fahrenheit: " + temp.toFahrenheit() + "°F");
        System.out.println(" Kelvin: " + temp.toKelvin() + "K");

    }
}
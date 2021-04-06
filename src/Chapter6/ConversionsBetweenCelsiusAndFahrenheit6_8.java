package Chapter6;

public class ConversionsBetweenCelsiusAndFahrenheit6_8 {
    public static void main(String[] args) {

        System.out.println("Celsius ------- Farhenheit -- | -- Farhenheit ------- Celsius");
        for (double i = 40.0, j = 120.0; i >= 31.0 && j>=30.0; i-- , j-=10){
            System.out.println(i+"     "+celsiusToFahrenheit(i)+"  |  "+j+"     "+fahrenheitToCelsius(j));
        }
    }


    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

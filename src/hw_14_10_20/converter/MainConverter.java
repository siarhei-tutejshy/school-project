package hw_14_10_20.converter;

import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {
        System.out.println("Enter value in Celsius");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        KelvinConverter kelvin = new KelvinConverter();
        CelsiusConverter celsius = new CelsiusConverter();
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        celsius.convert(x);
        fahrenheit.convert(x);
        kelvin.convert(x);
    }
}

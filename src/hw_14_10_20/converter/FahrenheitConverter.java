package hw_14_10_20.converter;

public class FahrenheitConverter implements Converter {
    double value;
    double result;

    @Override
    public double convert(double value) {
        this.value = value;
        result = value * 9 / 5 + 32;
        System.out.println("Conversion from Celsius deg. to Fahrenheut deg.:" + result);
        return result;
    }
}

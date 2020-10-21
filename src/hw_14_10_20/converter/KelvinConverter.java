package hw_14_10_20.converter;

public class KelvinConverter implements Converter {
    double value;
    double result;

    @Override
    public double convert(double value) {
        this.value = value;
        result = value + 273.15;
        System.out.println("Conversion from Celsius deg. to Kalvin deg.:" + result);
        return result;
    }
}

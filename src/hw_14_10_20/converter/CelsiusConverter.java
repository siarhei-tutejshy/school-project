package hw_14_10_20.converter;

public class CelsiusConverter implements Converter {
    double value;

    @Override
    public double convert(double value) {
        this.value = value;
        System.out.println("Degrees Celsius is:" + value);
        return value;
    }
}

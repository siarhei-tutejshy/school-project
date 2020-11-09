package hw_09_11_20.lambda.carmall;

public class PriceFilter implements CarFilter {
    private double price;

    public PriceFilter(double price) {
        this.price = price;
    }

    @Override
    public boolean showCar(Car c) {

        return false;
    }
}


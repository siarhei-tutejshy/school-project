package hw_09_11_20.lambda.carmall;

import java.util.List;

public class AppCarMall {
    public static void main(String[] args) {
        CarMall carMall = new CarMall();
        List<Car> filteredByPrice = carMall.showCars(c -> c.getPrice() > 10000);
        System.out.println(filteredByPrice);
    }
}

package hw_09_11_20.lambda.carmall;

import java.util.ArrayList;
import java.util.List;

public class CarMall {
    private List<Car> cars = new ArrayList<>();

    public CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "Hatchback"));
        cars.add(new Car("Toyota", 2013, 19000.0, "SUV"));
        cars.add(new Car("Nissan", 2002, 3000.0, "SUV"));
        cars.add(new Car("Ford", 20017, 19000.0, "SEDAN"));
        cars.add(new Car("Peugeot", 2016, 11000.0, "Coupe"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> showCars(CarFilter carFilter) {
        ArrayList<Car> filterCars = new ArrayList<>();
        for (Car c : cars) {
            if (carFilter.showCar(c)) {
                filterCars.add(c);
            }
        }
        return filterCars;
    }
}

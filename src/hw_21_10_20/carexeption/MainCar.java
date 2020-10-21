package hw_21_10_20.carexeption;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Peugeot", 180.0, 4000);
        Car car2 = new Car("Renault", 150.0, 3500);
        try {
            car2.start();

            car1.start();
        } catch (CarIsNotStartedException e) {
            System.out.println(e.getMessage());
        }

    }
}

package hw_28_10_20.carshowroom;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainShowRoom {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 2005, 1.6, 5700);
        Car car2 = new Car("Peugeot", "406 Coupe", 2001, 2.0, 3400);
        ArrayList<Car> car = new ArrayList<>();
        car.add(car1);
        car.add(car2);
        Scanner sc = new Scanner(System.in);
        int x;
        String brand;
        String model;
        int year;
        double engine;
        int coast;

        for (; ; ) {
            do {
                System.out.println(" 1. Add your Car;");
                System.out.println("2. See the Car;");
                System.out.println("3. Buy some Car;");
                System.out.println("4. Show all Cars;");
                System.out.println("5. Leave Showroom;");
                x = sc.nextInt();
            } while(x == 0);
            if(x == 5) break;

            switch (x) {
                case 1:
                    try {
                        System.out.println("Add your Car ");
                        System.out.println("Enter the Brand:");
                        brand = sc.next();
                        System.out.println("Enter the Model:");
                        model = sc.next();
                        System.out.println("Enter year of manufacture:");
                        year = sc.nextInt();
                        System.out.println("Enter engine capacity:");
                        engine = sc.nextDouble();
                        System.out.println("Enter desired coast: ");
                        coast = sc.nextInt();
                        car.add(new Car(brand, model, year, engine, coast));
                        System.out.println("You car was added");
                    } catch (InputMismatchException e) {
                        System.out.println("You entered something wrong");
                    }
                    break;
                case 2:

                    for (Car i : car) {
                        int y = (car.indexOf(i) + 1);
                        System.out.println(y + " " + i.getBrand() + " " + i.getModel());
                    }
                    System.out.println("To see some car select:");
                    int o = sc.nextInt();
                    try {
                        System.out.println(car.get(o - 1));
                    } catch (IndexOutOfBoundsException exception) {
                        System.out.println("You enter wrong number");
                    }

                    break;

                case 3:
                    System.out.println("Select the car to buy:");
                    for (Car i : car) {
                        int y = (car.indexOf(i) + 1);
                        System.out.println(y + ". " + i.getBrand() + " " + i.getModel());
                    }
                    int z = sc.nextInt();
                    try {
                        car.remove((z - 1));
                    } catch (IndexOutOfBoundsException exception) {
                        System.out.println("You enter wrong number");
                    }
                    if (car.isEmpty()) {
                        new EmptyArrayListException("Showroom is empty");
                    }
                    break;

                case 4:
                    for (Car i : car) {
                        System.out.println("All cars in the showroom:");
                        System.out.println(i.toString());
                    }
                    if (car.isEmpty()) {
                        new EmptyArrayListException("Showroom is empty");
                    }
                    break;
                default:
                    new WrongSelectNumberException("You select wrong number");
            }

        }
    }
}

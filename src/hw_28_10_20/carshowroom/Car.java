package hw_28_10_20.carshowroom;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private double engineCapacity;
    private int coast;

    public Car(String brand, String model, int yearOfManufacture, double engineCapacity, int coast) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
        this.coast = coast;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return "{" +
                "Brand ='" + brand + '\'' +
                ", Model ='" + model + '\'' +
                ", Year of Manufacture =" + yearOfManufacture +
                ", Engine capacity=" + engineCapacity +
                ", Coast=" + coast + "$" +
                '}';
    }
}

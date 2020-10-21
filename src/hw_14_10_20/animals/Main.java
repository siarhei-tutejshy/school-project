package hw_14_10_20.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Omnivorous", "Feline", "Sphinx");
        Dog dog = new Dog("Omnivorous", "Canine", "labrador");
        Mouse mouse = new Mouse("Herbivore", "Rodent", "White laboratory");

        cat.print();
        cat.speedOfRunning(23);
        cat.eatOrEaten();
        cat.voice();

        dog.print();
        dog.speedOfRunning(52);
        dog.eatOrEaten();
        dog.voice();

        mouse.print();
        mouse.speedOfRunning(6);
        mouse.eatOrEaten();
        mouse.voice();
    }
}

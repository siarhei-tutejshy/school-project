package hw_14_10_20.animals;

public class Dog extends Animals implements Voice {
    @Override
    public String toString() {
        return "Dog{" +
                "typeOfEating='" + typeOfEating + '\'' +
                ", family='" + family + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public Dog(String typeOfEating, String family, String species) {
        super.typeOfEating = typeOfEating;
        super.family = family;
        super.species = species;

    }

    @Override
    public void voice() {
        System.out.println("Dog says 'Woof'\n");
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public void eatOrEaten() {
        System.out.println("Dog can eat smt");
    }
}

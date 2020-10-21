package hw_14_10_20.animals;

public class Cat extends Animals implements Voice {
    public Cat(String typeOfEating, String family, String species) {
        super.typeOfEating = typeOfEating;
        super.family = family;
        super.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "typeOfEating='" + typeOfEating + '\'' +
                ", family='" + family + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Cat says 'Meow'\n");
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
     public void eatOrEaten() {
        System.out.println("Cat can eat smt. or can be eaten");
    }
}

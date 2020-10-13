package hw_14_10_20.animals;

public class Mouse extends Animals implements Voice {
    @Override
    public String toString() {
        return "Mouse{" +
                "typeOfEating='" + typeOfEating + '\'' +
                ", family='" + family + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public Mouse(String typeOfEating, String family, String species) {
        super.typeOfEating = typeOfEating;
        super.family = family;
        super.species = species;

    }

    @Override
    public void voice() {
        System.out.println("Mouse says 'Squeak'\n");
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    void eatOrEaten() {
        System.out.println("Mouse can be eaten");
    }
}

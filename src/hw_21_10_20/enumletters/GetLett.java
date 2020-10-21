package hw_21_10_20.enumletters;

public class GetLett {
    Letters let;

    public void getrLetters() {
        for (Letters l : Letters.values()) {
            int i = l.ordinal() + 1;
            System.out.println(l + " - " + i);
        }
    }
}

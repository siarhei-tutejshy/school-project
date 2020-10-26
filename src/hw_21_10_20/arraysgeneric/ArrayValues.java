package hw_21_10_20.arraysgeneric;

public class ArrayValues<T> {
    private T[] array;

    public T getArrayIndex(int x) {
        return array[x];
    }

    public void setArray(T[] array) {
        this.array = array;
    }

}

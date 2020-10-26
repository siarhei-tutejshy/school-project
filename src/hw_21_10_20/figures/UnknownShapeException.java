package hw_21_10_20.figures;

public class UnknownShapeException extends Exception {
    public UnknownShapeException(String message) {
        super(message);
        System.out.println(message);
    }
}

package hw_21_10_20.figures;

import java.util.Scanner;

public class MainFigures {
    public static void main(String[] args) {
        System.out.println("Write 'circle', 'triangle', or 'rectangle'");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "circle":
                Circle circle = new Circle("circle", 3);
                System.out.println("It is Circle");
                break;
            case "triangle":
                Triangle tr = new Triangle("triangle", 43, 45);
                System.out.println("It is Triangle");
                break;
            case "rectangle":
                Rectagle rec = new Rectagle("rectangle", 15, 16);
                System.out.println("It is Rectangle");
                break;
            default:
                new UnknownShapeException("No such shape");
        }
    }
}

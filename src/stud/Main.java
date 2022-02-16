package stud;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static double getSumOfAreas(Shapes[] shapeArr ) {

        double sum = 0.0;
        for(Shapes elem: shapeArr) {
            System.out.println("Shape area is: " + elem.calcArea());
            System.out.println(elem.toString());
            sum +=elem.calcArea();
        }

        System.out.println("Summ of areas is: " + sum);
        return sum;
    }

    public static void drawArr (Shapes[] arr){
        System.out.println(" ");
        System.out.println("Sort by area");
        Arrays.sort(arr);
        for(Shapes elem: arr) {
            elem.draw();
        }
    }

    public static void printColors (Shapes[] arr){
        System.out.println(" ");
        System.out.println("Sort by color");
        Arrays.sort(arr, Comparator.comparing(Shapes::getShapeColor));
        for(Shapes elem: arr) {
            elem.draw();
        }
    }

    public static void main(String[] args) {

        Circle circle = new Circle("Green", 22);
        Rectangle rectangle = new Rectangle("Black", 122.5, 13.7);
        Triangle triangle = new Triangle(12, 13, 14, "Purple");
        Triangle triangle2 = new Triangle(22, 23, 24, "Yellow");
        Triangle triangle3 = new Triangle(32, 33, 34, "White");

        Shapes[] shapesArr = new Shapes[]{triangle3 ,triangle, triangle2, rectangle, circle};
        drawArr(shapesArr);
        //getSumOfAreas(shapeArr);

        printColors(shapesArr);
        
    }
}

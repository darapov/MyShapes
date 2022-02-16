package stud;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Shapes implements Drawable, Comparator<Shapes>, Comparable <Shapes>{

    private String shapeColor;

    public Shapes(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public void draw(){
        System.out.println(toString() + " Area is: " + calcArea());
    };


    @Override
    public String toString() {
        return "This shape is " + getClass().getSimpleName() + ", color is " +
                shapeColor;
    }


    @Override
    public int compare(Shapes o1, Shapes o2) {
        return o1.getShapeColor().compareTo(o2.getShapeColor());
    }
/*
    public static void printColors (Shapes[] arr){
        Arrays.sort(arr, Comparator.comparing(Shapes::getShapeColor));
    }

 */


    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public int compareTo(Shapes shape) {

        //var x = (Triangle) shape;
        return (int) (this.calcArea() - shape.calcArea());
    }
}

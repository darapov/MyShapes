package stud;

public class Circle extends Shapes{

    private String color;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14*Math.pow(radius,2);

    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }



    /*
    @Override
    public int compareTo(Shapes shape) {
        return 0;
    }

     */
}

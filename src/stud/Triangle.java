package stud;


public class Triangle extends Shapes {

    private double a;
    private double b;
    private double c;
    private String color;

    public Triangle( double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }



    @Override
    public double calcArea(){
        double p = a + b + c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b + ", c = " + c;
    }







}

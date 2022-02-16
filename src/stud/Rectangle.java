package stud;

public class Rectangle extends Shapes{


    private String color;
    private double width;
    private double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.color = color;
        this.width = width;
        this.height = height;
    }



    @Override
    public double calcArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return super.toString()  + ", width = " + width + ", height = " + height;
    }


/*
    @Override
    public int compareTo(Shapes shape) {
        return 0;
    }

 */
}

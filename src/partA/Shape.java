package partA;

public abstract class Shape {
    abstract void area();
    double area;
}

class Triangle extends Shape{
    @Override
    void area() {
        System.out.println("Area of triangle= "+(10*15)/2);
    }
}

class Rectangle extends Shape{
    @Override
    void area() {
        System.out.println("Area of rectangle : "+(70*20));
    }
}

class Circle extends Shape{

    public static void main(String[] args) {
        new Triangle().area();
        new Rectangle().area();
        new Circle().area();
    }

    @Override
    void area() {
        System.out.println("Area of circle : "+(Math.PI*5*5));
    }
}
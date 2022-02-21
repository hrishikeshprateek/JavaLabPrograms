package partA;

public class AreaOfShapes {

    public static void main(String[] args) {
        area(5.5,1.5);
        area(10,12);
        area(2.5);
    }

    public static void area(double b, double h){
        System.out.println("The area of triangle is "+(0.5*b*h)+" Sq units");
    }

    public static void area(int a, int b){
        System.out.println("The area of rectangle is "+(a*b)+" Sq units");
    }

    public static void area(double r){
        System.out.println("The area of circle is "+(Math.PI)*r*r+" Sq units");
    }

}

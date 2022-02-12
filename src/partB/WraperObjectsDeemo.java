package partB;

public class WraperObjectsDeemo {

    public static void main(String args[]) {
        int i = 100;
        System.out.println("The primitive value of i1 : " + new Integer(i).intValue());
        System.out.println("The primitive value of i2 : " + Integer.valueOf(200).intValue());
        System.out.println("The value of num2 : " + Integer.parseInt("12345"));
        System.out.println("The string value of i2 : " + Integer.valueOf(200).intValue());
    }
}

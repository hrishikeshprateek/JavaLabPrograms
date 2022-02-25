package partA;

public class Catch {
    public static void main(String[] args) {
        try {
            int num = 20/30;
            Integer.parseInt("r");
            int a[] = new int[10];
            a[11] = 12;

        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException exception){
            System.out.println("Exception "+ exception.getMessage());
        }
    }
}

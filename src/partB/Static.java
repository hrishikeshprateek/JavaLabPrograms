package partB;

public class Static {

    int i;
    static int j;

    static void function1() {
        System.out.println(j++);
        System.out.println(new Static().i=15);
    }

    public static void main(String args[]) {
        function1();
        function1();
        System.out.println(new Static().i = 150);
    }

}

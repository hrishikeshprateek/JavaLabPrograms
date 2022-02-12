package partB;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String args[]) {
        int[] x = new int[5];
        int[] y = new int[x.length];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements");

        for (int i = 0; i < x.length; i++)
            x[i] = s.nextInt();
        System.out.println("The elements are");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            y[i] = x[i];
        }
        System.out.println("After copying the elements are");
        for (int d : y) {
            System.out.println(" " + d);
        }
        int min, max;
        min = max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) min = x[i];
            if (x[i] > max) max = x[i];
        }
        System.out.println("min is:" + min);
        System.out.println("max is:" + max);
    }
}

package partA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorsCmd {

    public static void main(String[] args) {
        Vector list = new Vector();
        list.addAll(Arrays.stream(args).toList());
        System.out.println("vector elements before sorting : "+list);
        Collections.sort(list);
        System.out.println("Elements after sorting : "+list);
    }
}

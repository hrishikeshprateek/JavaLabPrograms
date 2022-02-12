package partB;

import java.util.Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {
        Vector v = new Vector();
        v.add("C");
        v.add("C++");
        v.add("JAVA");
        v.add("J2EE");
        System.out.println("Initially-The vector contents:" + v);
        System.out.println("The last element:" + v.lastElement());
        System.out.println("The element at 2nd position:" + v.elementAt(2));
        v.insertElementAt("VB", 1);
        v.insertElementAt("C#", 0);
        System.out.println("After inserting-The vector contents:" + v);
        v.removeElementAt(3);
        System.out.println("After removeElementAt(3)-The vector contents:" + v);
        v.setElementAt("C++", 1);
        v.remove("VB");
        System.out.println("After remove('VB')-The vector contents:" + v);
    }
}

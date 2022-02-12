package partB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ConcatFiles {

    public static void main(String args[]) throws IOException {
        FileInputStream n1 = new FileInputStream("File1.txt");
        FileInputStream n2 = new FileInputStream("File2.txt");
        SequenceInputStream s = new SequenceInputStream(n1, n2);
        int c;
        while ((c = s.read()) != -1) {
            char ch = ((char) c);
            System.out.println(ch);
        }
        s.close();
        n1.close();
        n2.close();
    }

    }

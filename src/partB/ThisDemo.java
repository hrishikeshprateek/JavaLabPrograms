package partB;

public class ThisDemo {

    int i, j;

    ThisDemo() {
        this(100);
    }

    ThisDemo(int a) {
        this(a, 200);
    }

    ThisDemo(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void display() {
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }

    public static void main(String args[]) {
        new ThisDemo().display();
    }


}

package partA;

public class Threads {
    public static void main(String... args) {
        Printer print = new Printer();
        new Thread(new TaskEvenOdd(print, 10, false)).start();
        new Thread(new TaskEvenOdd(print, 10, true)).start();
    }
}

class TaskEvenOdd implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }

    }

}

class Printer {
    boolean isOdd = false;
    synchronized void printEven(int number) {

        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}
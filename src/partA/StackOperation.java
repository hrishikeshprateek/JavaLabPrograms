package partA;

import java.util.Stack;

public class StackOperation {

    public static void main(String[] args) {
        Stack stack = new Stack();
        pushElement(stack,23);
        pushElement(stack,43);
        pushElement(stack,12);
        popElement(stack);
    }

    public static void pushElement(Stack stack, Integer x){
        stack.push(x);
        System.out.println("puh -> "+x);
        System.out.println("stack -> "+stack);
    }

    public static void popElement(Stack stack){
        Integer integer = (Integer) stack.pop();
        System.out.println("pop -> "+integer);
        System.out.println("stack -> "+stack);
    }

}

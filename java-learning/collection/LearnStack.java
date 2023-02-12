package collection;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> stack =  new Stack(); // a stack is LIFO implementation

        stack.push("Red"); // .push will add the elements to the stack
        stack.push("Blue");
        stack.push("Green");
        stack.push("Yellow");
        stack.push("Purple");
        System.out.println(stack);

        System.out.println(stack.peek()); //.peek is used to retrieve or fetch the first element of the
                                          // Stack or the element present at the top of the Stack

        stack.pop(); // .pop is used to pop an element from the stack.
                    // The element is popped from the top of the stack.

        System.out.println(stack);
    }
}

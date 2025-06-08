import java.util.Stack;

public class StackInCollectionFramework {
    public static void main(String[] args) {
        
        /*
         * Declaration of Stack
         * 
         */

         Stack<Integer> stack = new Stack<>();

        //  Adding an element to the Stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Removing the last element from the stack that is pushed at at the end
        
        stack.pop();

        // Printing the stack

        System.out.println(stack);

        // If we want to see that what is the data present at the top of the stack, then we use peek() method

        System.out.println(stack.peek());

        // Check stack is empty or not

        stack.isEmpty(); // returns true or false

        // check size of the stack

        stack.size();

        // Search an element and returns the index number from the stack
        
        stack.search(3); // Top to bottom (i.e. 1 based Indexing)

    }
}

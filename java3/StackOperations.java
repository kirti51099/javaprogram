import java.util.*;

 class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements: " + stack);

        // Popping an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element in the stack
        int searchElement = 20;
        int position = stack.search(searchElement);
        if (position != -1) {
            System.out.println(searchElement + " found at position " + position + " from top of the stack.");
        } else {
            System.out.println(searchElement + " not found in the stack.");
        }
    }
}



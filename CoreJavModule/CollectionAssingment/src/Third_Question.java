/*Design a Data Structure SpecialStack that supports all the stack operations
like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
which should return minimum element from the SpecialStack. (Expected complexity  O(1))
 */

import java.util.Stack;

class SpecialStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    //push operation

    public void push(int x){
        mainStack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek()) {
            minStack.push(x);
        }
    }

    //pop operation

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int removed = mainStack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }

    // get minimum element
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    //Checking Empty stack
    public boolean isEmpty(){
        return mainStack.isEmpty();
    }

    //is full additional feature
    public boolean isFull(){
        return false;
    }

}
public class Third_Question {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        //pushing values to stack
        stack.push(2);
        stack.push(5);
        stack.push(67);
        stack.push(45);

        //checking minimum element
        System.out.println(stack.getMin());

        stack.pop();

        //check  full or not
        System.out.println(stack.isFull());
    }
}

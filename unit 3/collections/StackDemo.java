import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        //add elements
        stack.push(20);
        stack.push(30);
        stack.push(40);

        //display stack elements
        System.out.println("Stack elements:"+" "+stack);

        //access element
        System.out.println("top element is:"+" "+stack.peek());

        //pop elements
        stack.pop();
        System.out.println("Stack after removal:"+" "+stack);

        //check if stack is empty
        System.out.println("is Stack empty?:"+" "+stack.isEmpty());

        //search for element
        System.out.println("position of 30:"+" "+stack.search(30));

        //iterate through stack
        for(Integer item:stack){
            System.out.println(item);
        }
    }    


}

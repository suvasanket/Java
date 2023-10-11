import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty());
        stack.push("minecraft");
        stack.push("skyland");
        stack.push("doom");

        String pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
        System.out.println(stack.peek());// top element
        System.out.println(stack.search("skyland"));
        System.out.println("done");

    }
}

import java.util.Stack;
class Day22 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(4));
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack);
    }
}
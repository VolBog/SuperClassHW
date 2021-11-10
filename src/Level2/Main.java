package Level2;

public class Main {
    public static void main(String[] args) {
        String a = "Vasia";
        String b = "Vova";

        Stack stack = new Stack(2);
        stack.push(a);
        stack.push(b);

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(b);

        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

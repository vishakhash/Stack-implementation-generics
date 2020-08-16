public class StackDemo {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        while (! stack.isEmpty()){
            int x= stack.peek();
            System.out.println(x);
            stack.pop();
        }
        System.out.println(stack.pop());
    }

}

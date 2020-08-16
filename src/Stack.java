public class Stack<T> {

   private StackNode<T> top;

    public T pop() throws Exception {
        if (top==null)throw new Exception("Stack is Empty");
        T item= top.data;
        top=top.next;
        return item;
    }

    public void push(T data){
        StackNode<T> item = new StackNode<>(data);
        item.next= top;
        top= item;
    }

    public T peek() throws Exception {
        if (top==null)throw new Exception("Stack is Empty");
        return top.data;
    }

    public boolean isEmpty(){
        if (top==null) return true;
        else return false;
    }

}

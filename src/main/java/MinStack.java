import java.util.Stack;

public class MinStack {
    Stack<Integer> main;
    Stack<Integer> helper;

    public MinStack() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        main.push(x);
        if (helper.isEmpty()||helper.peek()>x){
            helper.push(x);
        }
    }

    public void pop() {
        if (main.pop().equals(helper.peek())) {
            helper.pop();
        }

    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}

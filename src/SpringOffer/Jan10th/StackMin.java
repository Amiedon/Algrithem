package SpringOffer.Jan10th;

import java.util.Stack;

/**
 * Created by Amie on 2019/1/10.
 */
public class StackMin {
    public Stack<Integer> stack_data = new Stack<>();
    public Stack<Integer> stack_sup = new Stack<>();
    public void push(int node){
        stack_data.push(node);
        if (stack_sup.isEmpty())
            stack_sup.push(node);
        else {
            if (node <= stack_sup.peek()){
                stack_sup.push(node);
            }
            else stack_sup.push(stack_sup.peek());
        }
    }
    public void pop() throws Exception {
        if (!stack_data.isEmpty()){
            stack_data.pop();
            stack_sup.pop();
        }else {
            throw new Exception("栈为空");
        }
    }
    public int min(){
        return stack_sup.peek();
    }

    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.push(3);
        stackMin.push(4);
        stackMin.push(5);
        System.out.println(stackMin.min());
    }
}

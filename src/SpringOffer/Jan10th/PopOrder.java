package SpringOffer.Jan10th;

import java.util.Stack;

/**
 * Created by Amie on 2019/1/10.
 */
public class PopOrder {
    public boolean IsPopOrder(int [] pushA, int [] popA){
        if (pushA.length == 0 || popA.length == 0)
            return false;
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (index <popA.length && stack.peek() == popA[index]){
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }

    public boolean IsPopOrder2(int [] pushA, int [] popA){
        if (pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (index < popA.length && stack.peek() == popA[index]){
                stack.pop();
                index ++;
                break;
            }
        }
        return stack.isEmpty();
    }
}

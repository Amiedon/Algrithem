package HW;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Amie on 2018/4/10.
 */
public class HW_02 {
    public static Stack<Integer> stack = new Stack<>();
    public static int MIN;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        MIN = n-1;
        int step = 0;
        stack.push(nums[0]);
        dfs(step, 0, nums);
        System.out.println(MIN+1);
    }

    public static void dfs(int step, int curindex, int[] nums){
        if (curindex>=MIN+1){
            if (step<MIN){
                MIN = step;
            }
        }
        else {
            for (int i=1;i<=stack.peek();i++){
                if (i+curindex<nums.length) {
                    stack.push(nums[i + curindex]);
                    dfs(step + 1, curindex + i, nums);
                    stack.pop();
                }
                else {
                    if (step<MIN){
                        MIN = step;
                    }
                }
            }
        }
    }
}

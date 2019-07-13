package offer2017;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Amie on 2018/5/3.
 */
public class Save_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] str = scanner.next().toCharArray();
            int k = scanner.nextInt();
            process(str, k);
        }
    }

    private static void process(char[] str, int k) {
        int i=1;
        Stack<Character> stack = new Stack<>();
        stack.push(str[0]);
        while (k>0 && i < str.length){
            while (!stack.isEmpty() && k>0 && stack.peek() < str[i]){
                stack.pop();
                --k;
            }
            stack.push(str[i]);
            i++;
        }
        while (k-- >0)
            stack.pop();
        printStack(stack);
        printCharArr(str, i);
        System.out.println();
    }

    private static void printCharArr(char[] str, int start) {
        while (start < str.length) {
            System.out.print(str[start++]);
        }
    }

    private static void printStack(Stack<Character> stack) {
        for (char c : stack)
            System.out.print(c);
    }

}

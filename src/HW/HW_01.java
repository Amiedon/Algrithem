package HW;

import java.util.Scanner;

/**
 * Created by Amie on 2018/4/10.
 */
public class HW_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] nums = new int[1000];
        for (int i=0;i<string.length();i++){
            nums[string.charAt(i)]+=1;
        }
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]!=0){
//                System.out.print((char)i);
//                nums[i]-=1;
//            }
//        }
        boolean flag = true;
        while (flag){
            for (int i=0;i<nums.length;i++){
                if (nums[i]!=0){
                    System.out.print((char)i);
                    nums[i]-=1;
                }
            }
            for (int i=0;i<nums.length;i++){
                if (nums[i]!=0){
                    flag = true;
                    break;
                }
                flag = false;
            }
        }
    }
}

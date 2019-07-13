package HW;

import java.util.Scanner;

/**
 * Created by Amie on 2018/4/10.
 */
public class BigMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        System.out.println(multy(num1, num2));
    }

    public static String multy(String digit1, String digit2){
        int[] nums1 = new int[digit1.length()];
        int[] nums2 = new int[digit2.length()];
        int[] result = new int[nums1.length+nums2.length];
        for (int i=0;i<digit1.length();i++){
            nums1[i] = Integer.parseInt(String.valueOf(digit1.charAt(i)));
        }
        for (int i=0;i<digit1.length();i++){
            nums2[i] = Integer.parseInt(String.valueOf(digit2.charAt(i)));
        }
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                result[i+j] += nums1[i]*nums2[j];
            }
        }
        for (int i=result.length-1;i>0;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<result.length-1;i++)
            stringBuilder.append(result[i]);
        return stringBuilder.toString();
    }
}

package MT;

import java.util.Scanner;

/**
 * Created by Amie on 2018/4/20.
 */
public class Num_N_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextLong();
        }
        for (int i=0;i<n;i++){
            long index = getNm(nums[i]);
            if (index<=1)
                System.out.println(nums[i]);
            else {
                int result = 9;
                for (int j=2;j<index;j++){
                    result += 9*Math.pow(10, j-1)*j;
                }
                result +=(nums[i]-Math.pow(10, index-1) +1)*index;
                System.out.println(result);
            }
        }
    }

    public static long getNm(long n){
        int l = 0;
        while (n!=0){
            l++;
            n/=10;
        }
        return l;
    }
}

package MT;

import java.util.Scanner;

/**
 * Created by Amie on 2018/4/20.
 */
public class NUmN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<n;i++){
            stringBuilder = new StringBuilder();
            for (int j=1;j<=nums[i];j++){
                stringBuilder.append(j);
            }
            System.out.println(stringBuilder.toString().length());
        }
    }
}

package TouTiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Amie on 2018/3/24.
 */
public class TouTiao_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] num = new int[n];
        for (int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++)
            {
                if (Math.abs(num[i]-num[j])==k)
                    map.put(num[i], num[j]);
            }
        }
        System.out.println(map.size());
    }
}

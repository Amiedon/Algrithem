package MT;

import java.util.Scanner;

/**
 * Created by Amie on 2018/4/20.
 */
public class GCD {
    public static int getGCD(int m ,int n){
        if (n==0)
            return m;
        else return getGCD(n, m%n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int [] num = new int[N];
        num[0] = p;
        int result = 0;
        for (int i=1;i<N;i++){
            num[i] = (num[i-1]+153)%p;
        }
        int index = 0;
        for (int i=1;i<=n;i++){
            for ( int j=1;j<=m;j++) {
                index = getGCD(i, j);
                result += num[index-1];
            }
        }
        System.out.println(result);
    }
}

package JZOffer;

import java.util.*;

/**
 * Created by Amie on 2018/2/23.
 */
public class Championship {
    public static void main(String[] args) {
        System.out.println(getA(3, 1));
        System.out.println(getC(5,2));
        int total = 1;
        int k=4;
        for (int i=2*k-1;i>1;i=i-2){
            total*=i;
        }
        Random random= new Random();
        System.out.println(random.nextInt(2));
    }


    public static int getA(int big, int small){
        int result = 1;
        for (int i=0;i<small;i++){
            result*= big-i;
        }
        return result;
    }
    public static int getC(int big, int small){
        int high = 1;
        int low = 1;
        for (int i=0;i<small;i++){
            high*=big-i;
        }
        for (int i=1;i<=small;i++){
            low*=i;
        }
        return high/low;
    }

    public static int getGCD(int m, int n){
        if (n==0)
            return m;
        else
            return getGCD(n, m%n);
    }

}

package TouTiao;

import java.util.Scanner;

/**
 * Created by Amie on 2018/3/24.
 */
public class TouTiao_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long count = 0;
        int k=0;
        for (int i=0;;i++){
            if (Math.pow(2, i)==n)
            {
                k = i;
                System.out.println(k);
                return;
            }
            if (Math.pow(2, i)>n)
            {
                k = i-1;
                break;
            }

        }
//        count = k+n- (int)Math.pow(2, k);
//        System.out.println(count);
//        System.out.println(k);
        long small = 0;
        long larg = 0;
        long temp = 0;
        for (int i=k;i>0;i--){
            count=0;
            count+=i;
            small = i;
            larg = (long)Math.pow(2, i);
//            while (true){
//                if (larg == n){
//                    System.out.println(count);
//                    return;
//                }
//                else if (larg>n){
//                    break;
//                }
//                temp = small+larg;
//                small = larg;
//                larg = temp;
//                count++;
//            }
            if ((n-larg)%small == 0){
                count+= (n-larg)/small;
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }
}

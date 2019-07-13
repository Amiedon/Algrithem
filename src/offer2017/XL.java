package offer2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/5/3.
 */
public class XL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(min(str));
        }
        scanner.close();
    }

    private static int min(String str) {
        char [] arr = str.toCharArray();
        int len = arr.length;
        for (int i=5;i<len;i++){
            for (int j=0;j<len;j++){
                StringBuilder stringBuilder = new StringBuilder();
                for (int k=j;k<j+i;k++){
                    stringBuilder.append(arr[k%len]);
                }
                String result = stringBuilder.toString();
                if (result.contains("A") && result.contains("B") && result.contains("C") && result.contains("D")&&
                        result.contains("E")){
                    return len-i;
                }
            }
        }
        return 0;
    }
}

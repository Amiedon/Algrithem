package TouTiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Amie on 2018/3/29.
 */
public class SafeACount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] relations = new String[m];
        for (int i=0;i<m;i++){
            relations[i] = scanner.next();
        }
        int[] start_node = new int[m];
        int[] end_node = new int[m];
        for (int i=0;i<m;i++){
            String[] temp = relations[i].split(",");
            start_node[i] = Integer.parseInt(temp[0]);
            end_node[i] = Integer.parseInt(temp[1]);
        }
        boolean flag = false;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0;i<m;i++){
            int temp = end_node[i];
            flag = false;
            for (int j=0;j<m;j++){
                if (start_node[j]==temp)
                    flag = true;
            }
            if (!flag)
                result.add(temp);
        }
        if (result.size()<=0)
            System.out.println("None");
        else
            for (int i=0;i<result.size();i++)
                System.out.println(result.get(i));
    }
}

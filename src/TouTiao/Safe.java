package TouTiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Amie on 2018/3/29.
 */
public class Safe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] relations = new String[m];
        boolean[] state = new boolean[n+1];
        boolean[] state2 = new boolean[n+1];
        String[] temp;
        for (int i=0;i<m;i++){
            relations[i] = scanner.next();
            temp = relations[i].split(",");
            state[Integer.parseInt(temp[0])] = true;
            state2[Integer.parseInt(temp[1])] = true;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=1;i<n+1;i++){
            if (!state[i] && state2[i])
                result.add(i);
        }
        if (result.size()<=0)
            System.out.println("None");
        else {
            for (int i = 0; i < result.size() - 1; i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.print(result.get(result.size()-1));
        }
    }
}

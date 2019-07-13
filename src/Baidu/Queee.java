package Baidu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Amie on 2018/4/18.
 */
public class Queee {
    public static int n;
    public static int m;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         m = scanner.nextInt();
        int x_0 = scanner.nextInt();
        int y_0 = scanner.nextInt();
        int[][] zone = new int[n][m];
        int[][] flag = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++)
                zone[i][j] = scanner.nextInt();
        }
        int max = 0;

        getmax(zone, x_0-1, y_0-1, max, flag);
        System.out.println(list.get(list.size()-1));
    }

    public static void getmax(int[][] zone, int x, int y, int max, int[][] flag){
        if (zone[x][y]>max) {
            max = zone[x][y];
            flag[x][y]=1;
            list.add(max);
        }
        else {
            flag[x][y] = 0;
            return;
        }
        if (x+1 <n && y<m && flag[x+1][y] ==0)
            getmax(zone, x+1, y, max, flag);
        if (x-1>=0 && y<m && flag[x-1][y]==0)
            getmax(zone, x-1, y, max, flag);
        if (y+1<m && x<n && zone[x][y+1]==0)
            getmax(zone, x, y+1, max, flag);
        if (y-1>=0 && x<n && flag[x][y-1]==0)
            getmax(zone,x, y-1, max, flag);
        flag[x][y] = 0;
    }
}

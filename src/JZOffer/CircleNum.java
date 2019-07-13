package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class CircleNum {
    public int LastRemaining_Solution(int n, int m) {
        if (n<1 || m<1)
            return -1;
        int[] Nums = new int[n];
        int count = n;
        int step = 0;
        int i=-1;
        while (count>0){
            i++;
            if (i>=n) i=0;
            if (Nums[i] == -1)
                continue;
            step++;
            if (step==m){
                Nums[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
}

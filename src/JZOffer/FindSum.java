package JZOffer;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/3/10.
 */
public class FindSum {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum<3)
            return result;
        int small = 1;
        int big = 2;
        int cursum = small+big;
        while (small<sum){
            if (cursum == sum && small!=big){
                result.add(Record(small, big));
            }
            while (cursum > sum && small<sum){
                cursum-=small;
                small++;
                if (cursum == sum && small!=big){
                    result.add(Record(small, big));
                }
            }
            big++;
            cursum+=big;
        }
        return result;
    }
    public ArrayList<Integer> Record(int small, int big){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=small; i<=big;i++)
            arrayList.add(i);
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(new FindSum().FindContinuousSequence(15));
    }
}

package JZOffer;

import java.util.Arrays;

/**
 * Created by Amie on 2018/2/24.
 */
public class QuickSort {
    public static void  sort(int[] num, int left, int right){
        if (left<right){
            int index = partition(num, left, right);
            sort(num, left, index-1);
            sort(num, index+1, right);
        }
    }

    private static int partition(int[] num, int left, int right) {
        if (num==null || num.length<=0 || left<0 || right>=num.length)
            return 0;
        int prio = num[left+(right-left)/2];
        while (left<=right){
            while (num[left]<prio)
                left++;
            while (num[right]>prio)
                right--;
            if (left<=right){
                swap(num,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] num, int left, int right) {
        int temp = num[left];
        num[left] = num[right];
        num[right] = temp;
    }

    public static void main(String[] args) {
        int[] num = {7,3,5,1,2,8,9,2,6};
        sort(num, 0, num.length-1);
        for (int a: num){
            System.out.println(a);
        }
    }
}

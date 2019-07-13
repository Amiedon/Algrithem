package Dichotomy;

/**
 * Created by Amie on 2017/6/7.
 */
public class Solution {
    public int getLessIndex(int[] arr)
    {
        int n = arr.length;
        if (n == 1) return 0;
        if (n <= 0 ) return -1;
        for (int i=1;i<n-1;i++) if (arr[i] < arr[i+1] && arr[i]<arr[i-1]) return i;
        if (arr[0] <arr[1]) return 0;
        return n-1;
    }
}

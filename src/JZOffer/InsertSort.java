package JZOffer;

import java.lang.reflect.Array;

/**
 * Created by Amie on 2018/2/24.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int i, j, insertNote;
        for (i=1;i<a.length;i++){
            insertNote = a[i];
            j = i-1;
            while (j>=0 && insertNote<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNote;
        }
    }

    public static void main(String[] args) {
        int[] a = {38,65,97,76,13,27,49};
        insertSort(a);
        for (int num: a){
            System.out.println(num);
        }
    }
}

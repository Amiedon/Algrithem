package SpringOffer.J2ee;

import java.util.Arrays;

import static JZOffer.ShellSort.swap;

/**
 * Created by Amie on 2019/1/27.
 */
public class HeapSort {
    public static void sort(int[] array){
        for (int i = array.length/2-1;i>=0;i--){
            adjust(array, i, array.length);
        }
        for (int i=array.length-1;i>0;i--){
            swap(array, 0, i);
            adjust(array, 0, i);
        }
    }

    private static void adjust(int[] array, int k, int length) {
        int temp = array[k];
        for (int i=2*k+1;i<array.length;i=i*2+1){
            if (i+1<length && array[i] > array[i+1])
                i++;
            if (temp > array[i])
                break;
            else {
                array[k] = array[i];
                k = i;
            }
        }
        array[k] = temp;
    }

    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package SpringOffer.J2ee;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Amie on 2019/1/28.
 */
public class HeapSort2 {
    public int [] buildMaxHeap(int [] array){
        for (int i = (array.length-2)/2;i>=0;i--){
            adjustDownToUp(array, i, array.length);
        }
        return array;
    }

    private void adjustDownToUp(int[] array, int k, int length) {
        int temp = array[k];
        for (int i = k*2+1;i<length-1;i=i*2+1){
            if (i<length && array[i]<array[i+1])
                i++;
            if (temp>=array[i]){
                break;
            }else {
                array[k] = array[i];
                k = i;
            }
        }
        array[k] = temp;
    }

    public int [] heapsort(int[] array){
        array = buildMaxHeap(array);
        for (int i = array.length-1;i>1;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            adjustDownToUp(array, 0, i);
        }
        return array;
    }

    public int [] deleteMax(int [] array){
        array[0] = array[array.length-1];
        array[0] = -9999;
        adjustDownToUp(array, 0, array.length);
        return array;
    }

    public int[] insert(int [] array, int data){
        array[array.length-1] = data;
        int k = array.length-1;
        int parent = (k-1)/2;
        while (parent>=0 && data>array[parent]){
            array[k] = array[parent];
            k = parent;
            if (parent != 0)
                parent = (parent-1)/2;
            else break;
        }
        array[k] = data;
        return array;
    }

    public static void main(String[] args) {
        HeapSort2 heapSort2 = new HeapSort2();
        int[] array = {87,45,78,32,17,65,53,9,122};
        System.out.println(Arrays.toString(heapSort2.buildMaxHeap(array)));
        System.out.println(Arrays.toString(heapSort2.heapsort(array)));
        System.out.println(Arrays.toString(heapSort2.insert(array, 63)));
    }
}

package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/27.
 */
public class HeapMax {
    private int [] buildMaxHeap(int [] array){
        for (int i=(array.length -2)/2;i>=0;i--){  // 从array.length -1 的父节点 array.length-1-1 开始调整
            adjust(array, i, array.length);
        }
        return array;
    }

    private void adjust(int[] array, int k, int length) {
        int temp = array[k];
        for (int i=2*k+1;i<array.length-1;i=i*2+1){
            if (i < length && array[i] < array[i+1]){
                i++;
            }
            if (temp > array[i]){
                break;
            }
            else {
                array[k] = array[i];
                k = i;
            }
        }
        array[k] = temp;
    }

    public static void main(String[] args) {
        HeapMax hs = new HeapMax();
        int [] array = {87,45,78,32,17,65,53,9,122};
        int [] result = hs.buildMaxHeap(array);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

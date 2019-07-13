package SpringOffer;

/**
 * Created by Amie on 2019/1/8.
 */
public class RotatedArray {
    public int minNumberInRotateArray(int [] array){
        if (array.length ==0){
            return 0;
        }
        int start = 0;
        int end = array.length-1;
        while (start < end-1){
            int mid = (start + end)/2;
            if (array[mid] > array[start]){
                start = mid;
            }
            if (array[mid] < array[end]){
                end = mid;
            }
            if (array[mid] == array[start]){
                end-=1;
            }
        }
        return array[end];
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,1,0,1};
        System.out.println(new RotatedArray().minNumberInRotateArray(array));
    }
}

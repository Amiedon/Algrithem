package JZOffer;

/**
 * Created by Amie on 2018/2/24.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 7, 0, 10};
        System.out.println("排序前的数组为：");
        for (int num: arr){
            System.out.println(num+" ");
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int num: arr){
            System.out.println(num+" ");
        }
    }
}

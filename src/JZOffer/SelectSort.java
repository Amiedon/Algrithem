package JZOffer;

/**
 * Created by Amie on 2018/2/24.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 32, 24, 66, 7, 5, 23};
        System.out.println("交换之前：");
        for (int num: arr){
            System.out.println(num);
        }
        for (int i=0;i<arr.length-1;i++){
            int k=i;
            for (int j=k+1;j<arr.length;j++){
                if (arr[j]<arr[k]){
                    k = j;
                }
            }
            if (k!=i){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("交换之后为");
        for (int num:arr){
            System.out.println(num);
        }
    }
}

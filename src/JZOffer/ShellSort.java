package JZOffer;

/**
 * Created by Amie on 2018/2/24.
 */
public class ShellSort {
    public static int[] shellSort(int[] A, int n){
        if (A==null || n<2)
            return A;
        int feet = n/2;
        int index = 0;
        while (feet>0){
            for (int i=feet;i<n;i++){
                index = i;
                while (index>=feet){
                    if(A[index-feet] > A[index]){
                        swap(A,index-feet,index);
                        index-=feet;
                    }else{
                        break;
                    }
                }
            }
            feet/=2;
        }
        return  A;
    }
    public static void swap(int[] A,int m,int n){
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }

    public static void main(String[] args) {
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
        shellSort(data, data.length);
        for (int nn:data){
            System.out.println(nn);
        }
    }
}

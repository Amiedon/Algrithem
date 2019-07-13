package JZOffer;

/**
 * Created by Amie on 2018/3/10.
 */
public class MyMergeSort {
    public void Sort(int [] arr, int left, int right, int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            Sort(arr, left, mid, temp);
            Sort(arr, mid+1, right, temp);
            Merge(arr,left,  mid, right, temp);
        }
    }

    private void Merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i=left;
        int j=mid+1;
        int t = 0;
        while (i<=mid && j<=right){
            if (arr[i]<arr[j]){
                temp[t] = arr[i];
                t++;
                i++;
            }else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        while (i<=mid){
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j<=right){
            temp[t] = arr[j];
            t++;
            j++;
        }
        t = 0;
        while (left<=right){
            arr[left] = temp[t];
            left++;
            t++;
        }
    }

    public void sort(int[] arr){
        int [] temp = new int[arr.length];
        Sort(arr, 0, arr.length-1, temp);
        for (int nn: arr){
            System.out.println(nn   );
        }
    }

    public static void main(String[] args) {
        new MyMergeSort().sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
    }
}

package JZOffer;

/**
 * Created by Amie on 2018/3/10.
 */
public class InversePair {
    public int InversePairs(int [] array) {
        if (array.length<=0)
            return 0;
        int[] copy = new int[array.length];
        for (int i=0;i<array.length;i++){
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length-1);
        return count;
    }

    private int InversePairsCore(int[] array, int[] copy, int start, int end) {
        if (start == end)
        {
            copy[start] = array[start];
            return 0;
        }
        int length = (end - start) /2;
        int left = InversePairsCore(copy, array, start, start + length);
        int right = InversePairsCore(copy, array, start + length + 1, end);
        int i = start + length;
        int j = end;
        int indexCopy = end;
        int count = 0;
        while (i>=start && j>= start+length + 1){
            if (array[i]>array[j]){
                copy[indexCopy] = array[i];
                i--;
                indexCopy--;
                count+=j - start - length;
            }
            else {
                copy[indexCopy] = array[j];
                indexCopy--;
                j--;
            }
        }
        while (i>=start){
            copy[indexCopy] = array[i];
            indexCopy--;
            i--;
        }
        while (j>= start+length +1){
            copy[indexCopy] = array[j];
            indexCopy--;
            j--;
        }
        return count+left+right;
    }

    public static void main(String[] args) {
        System.out.println(new InversePair().InversePairs(new   int[]{7, 5, 6, 4}));
    }
}
